<template>
    <v-app id="inspire">
        <div>
            <v-app-bar app clipped-left flat>
                <v-toolbar-title>
                    <span class="second-word font uppercase"
                        >shop</span
                    >
                </v-toolbar-title>
                <v-spacer></v-spacer>
            </v-app-bar>

            <v-navigation-drawer app clipped flat>
                <v-list>
                    <v-list-item
                        class="px-2"
                        v-for="component in components"
                        :key="component.plural"
                        :to="`/${component.plural}`"
                        color="deep-purple lighten-2"
                    >
                        {{ component.name }}
                    </v-list-item>
                </v-list>
            </v-navigation-drawer>
        </div>

        <v-main>
            <v-container class="py-8 px-6" fluid>
                <router-view></router-view>
            </v-container>
        </v-main>
    </v-app>
</template>

<script>
export default {
    name: "App",

    components: {},

    data: () => ({
        useComponent: "",
        drawer: true,
        components: []
    }),

    mounted() {
        var me = this;
        me.components = this.$ManagerLists;
    }
};
</script>
<style>
</style>
                        style="font-weight:700;"
                        <v-app-bar-nav-icon
                            @click="openSideBar()"
                            style="z-index:1;
                            height:56px;
                            width:30px;
                            margin-right:10px;
                            font-weight:300;
                            font-size:55px;"
                        >
                            <div style="line-height:100%;">≡</div>
                        </v-app-bar-nav-icon>
                        shop
                    </span>
                <span v-if="urlPath!=null" 
                    class="mdi mdi-home" 
                    key="" 
                    to="/" 
                    @click="goHome()"
                    style="margin-left:10px; font-size:20px; cursor:pointer;"
                    ></span> 
            <v-navigation-drawer app clipped flat v-model="sideBar">
                        key="orders"
                        to="/orders"
                        @click="changeUrl()"
                        style="font-weight:700;"
                        Order
                        key="productSearches"
                        to="productSearches"
                        @click="changeUrl()"
                        style="font-weight:700;"
                        ProductSearch
                        key="shippings"
                        to="/shippings"
                        @click="changeUrl()"
                        style="font-weight:700;"
                        Shipping
                        key="inventories"
                        to="/inventories"
                        @click="changeUrl()"
                        style="font-weight:700;"
                        Inventory
                        key="customers"
                        to="/customers"
                        @click="changeUrl()"
                        style="font-weight:700;"
                        Customer
                        key="orderStatuses"
                        to="orderStatuses"
                        @click="changeUrl()"
                        style="font-weight:700;"
                        OrderStatus
            <v-container v-if="urlPath" class="py-8 px-6 mt-10" fluid>
            <v-container v-else class="py-8 px-6 mt-10" fluid>
                <v-row>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>
                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="orders"
                                    to="/orders"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    Order
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>
                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="productSearches"
                                    to="/productSearches"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px;"
                                >
                                    ProductSearch
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>
                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="shippings"
                                    to="/shippings"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    Shipping
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>
                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="inventories"
                                    to="/inventories"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    Inventory
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>
                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="customers"
                                    to="/customers"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px; border:solid 2px;"
                                >
                                    Customer
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
                                ><span class="mdi mdi-apps" style="font-size:60px; color:#9575CD;"></span>
                                </v-list-item-avatar>
                            </v-list-item>
                            <v-card-actions>
                                <v-btn 
                                    class="mx-auto"
                                    outlined
                                    rounded
                                    key="orderStatuses"
                                    to="/orderStatuses"
                                    @click="changeUrl()"
                                    color="deep-purple lighten-2"
                                    style="font-weight:500; font-size:20px; padding:15px;"
                                >
                                    OrderStatus
                                </v-btn>
                            </v-card-actions>
                        </v-card>
                </v-row>
        components: [],
        sideBar: true,
        urlPath: null,
    
    async created() {
      var path = document.location.href.split("#/")
      this.urlPath = path[1];
    },
    },
    methods: {
        openSideBar(){
            this.sideBar = !this.sideBar
        },
        changeUrl() {
            var path = document.location.href.split("#/")
            this.urlPath = path[1];
        },
        goHome() {
            this.urlPath = null;
        },
