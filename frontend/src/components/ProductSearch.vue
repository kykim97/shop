<template>

<v-data-table
    :headers="headers"
    :items="productSearch"
    :items-per-page="5"
    class="elevation-1"
  ></v-data-table>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'ProductSearch',
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        headers: [
            { text: "id", value: "id" },
            { text: "deliveryStatus", value: "deliveryStatus" },
            { text: "productId", value: "productId" },
            { text: "orderStatus", value: "orderStatus" },
            { text: "stock", value: "stock" },
        ],
        productSearch : [],
    }),
    async created() {
      var temp = await axios.get(axios.backend + '/productsearches')

      this.productSearch = temp.data._embedded.productsearches;

    },
    methods: {
    }
  }
</script>

