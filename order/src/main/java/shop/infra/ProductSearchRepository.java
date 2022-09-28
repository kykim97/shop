package shop.infra;

import shop.domain.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductSearchRepository extends CrudRepository<ProductSearch, Long> {


}