package shop.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="ProductSearch_table")
public class ProductSearch {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String deliveryStatus;
        private String productId;
        private String orderStatus;
        private Long stock;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public String getDeliveryStatus() {
            return deliveryStatus;
        }

        public void setDeliveryStatus(String deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
        }
        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }
        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }
        public Long getStock() {
            return stock;
        }

        public void setStock(Long stock) {
            this.stock = stock;
        }

}