<template>

<v-card style="width:300px; margin-left:5%;" outlined>
    <template slot="progress">
      <v-progress-linear
        color="deep-purple"
        height="10"
        indeterminate
      ></v-progress-linear>
    </template>

    <v-img
      style="width:290px; height:150px; border-radius:10px; position:relative; margin-left:5px; top:5px;"
      src="https://cdn.vuetifyjs.com/images/cards/cooking.png"
    ></v-img>

    <v-card-title v-if="value._links">
        Order # {{value._links.self.href.split("/")[value._links.self.href.split("/").length - 1]}}
    </v-card-title >
    <v-card-title v-else>
        Order
    </v-card-title >

    <v-card-text style = "margin-left:-15px; margin-top:10px;">

          <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
            <v-text-field label="ProductId" v-model="value.productId"/>
          </div>
          <div class="grey--text ml-4" v-else>
            ProductId :  {{value.productId }}
          </div>


          <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
            <v-text-field type="number" label="Qty" v-model="value.qty"/>
          </div>
          <div class="grey--text ml-4" v-else>
            Qty :  {{value.qty }}
          </div>

          <div class="grey--text ml-4" v-if="editMode" style = "margin-top:-20px;">
            <v-text-field label="CustomerId" v-model="value.customerId"/>
          </div>
          <div class="grey--text ml-4" v-else>
            CustomerId :  {{value.customerId }}
          </div>


          <div>
            <OrderDetail v-for="(val, index) in value.orderdetails" v-model="value.orderDetail[index]" 
            :editMode="false" v-bind:key="index" :inCard="true"/>
          </div>

          <div>
            <Payment label:=Payment v-model="value.payment" :editMode="editMode"/>
          </div>



    </v-card-text>

    <v-divider class="mx-4"></v-divider>

    <v-card-actions style = "position:absolute; right:0; bottom:0;">
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="edit"
        v-if="!editMode"
      >
        Edit
      </v-btn>
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="save"
        v-else
      >
        Save
      </v-btn>
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="remove"
        v-if="!editMode"
      >
        Delete
      </v-btn>
      <v-btn
        color="deep-purple lighten-2"
        text
        @click="orderDetail"
        v-if="!editMode"
      >
        OrderDetail
      </v-btn>

      <v-btn
        color="deep-purple lighten-2"
        text
        @click="showOrderDetail"
        v-if="!editMode"
      >
        Show OrderDetail
      </v-btn>
      
    </v-card-actions>
  </v-card>


</template>

<script>
  const axios = require('axios').default;
  
  
  
  
  import OrderDetail from './OrderDetail.vue
  
  import Payment from './vo/Payment.vue'
  
  
  export default {
    name: 'Order',
    components:{
      OrderDetail,
      Payment,
    },
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        date: new Date().toISOString().substr(0, 10),
        orderDetail : [],
        selectedOrderDetail : [],
        orderDetailBtn : false,
        orderDetailShowBtn : false,
    }),
    created(){
      if(typeof this.value.payment === 'undefined'){
        this.value.payment = {}
      }
    },

    methods: {
      edit(){
        this.editMode = true;
      },
      async save(){
        try{
          var temp = null;
          this.value.orderDetail = this.selectedOrderDetail
          if(this.isNew){
            temp = await axios.post(axios.fixUrl('/orders'), this.value)
          }else{
            temp = await axios.put(axios.fixUrl(this.value._links.self.href), this.value)
          }

          this.value = temp.data;

          this.editMode = false;
          this.$emit('input', this.value);

          if(this.isNew){
            this.$emit('add', this.value);
          }else{
            this.$emit('edit', this.value);
          }

        }catch(e){
          alert(e.message)
        }
      },
      async remove(){
        try{
          await axios.delete(axios.fixUrl(this.value._links.self.href))
          this.editMode = false;
          this.isDeleted = true;

          this.$emit('input', this.value);
          this.$emit('delete', this.value);

        }catch(e){
          alert(e.message)
        }
      },
    },
    async orderDetail(){
      if(!this.orderDetailBtn){
        var temp = await axios.get(axios.fixUrl('/orderdetails'))
        this.orderDetail = temp.data._embedded.orderdetails
        
      }
      this.orderDetailBtn = !this.orderDetailBtn
    },
    async show(){
        
        if(!this.orderDetailShowBtn){
          var temp = await axios.get(axios.fixUrl(this.value._links['orderDetail'].href));
          this.value.orderDetail = temp.data._embedded.orderdetails
          
        }
        this.orderDetailShowBtn = !this.orderDetailShowBtn
      }
  }
</script>

