
from AbstractEvent import AbstractEvent
import json

class OrderPlaced(AbstractEvent):
    id : int
    productId : str
    qty : int
    customerId : str
    
    def __init__(self):
        super().__init__()
        self.id = None
        self.productId = None
        self.qty = None
        self.customerId = None

