from AbstractEvent import AbstractEvent
import json
from datetime import datetime

class Shipped(AbstractEvent):
    id : int
    orderId : int
    
    def __init__(self):
        super().__init__()
        self.id = None
        self.orderId = None

