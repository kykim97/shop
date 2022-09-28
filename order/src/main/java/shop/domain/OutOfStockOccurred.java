package shop.domain;

import shop.domain.*;
import shop.infra.AbstractEvent;
import java.util.Date;

public class OutOfStockOccurred extends AbstractEvent {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

