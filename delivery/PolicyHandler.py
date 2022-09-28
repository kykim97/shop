import util
import ShippingDB
from Shipping import Shipping
shippingrepository = ShippingDB.repository


from OrderPlaced import OrderPlaced

def wheneverOrderPlaced_StartDelivery(data):
    event = OrderPlaced()
    event = util.AutoBinding(data, event)
    
    shipping = Shipping()
    shippingrepository.save(shipping)
    
from OrderCancelled import OrderCancelled

def wheneverOrderCancelled_CancelDelivery(data):
    event = OrderCancelled()
    event = util.AutoBinding(data, event)
    
    shipping = Shipping()
    shippingrepository.save(shipping)
    

