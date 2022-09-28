from sqlalchemy.ext.declarative import declarative_base 
from sqlalchemy import Column, String, Integer, event, Float, Boolean
from datetime import datetime

import util
from Shipped import Shipped

Base = declarative_base()

class Shipping(Base):
    __tablename__ = 'Shipping_table'
    id = Column(Integer, primary_key=True)
    orderId = Column(Integer)

    def __init__(self):
        self.id = None
        self.orderId = None

@event.listens_for(Shipping, 'after_insert')
def PostPersist(mapper, connection, target):
    event = Shipped()
    event = util.AutoBinding(target, event)

    event.Publish()
    

    

