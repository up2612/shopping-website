package com.cts.placed_orders.repoistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.placed_orders.model.OrderDetails;
//import com.cts.placed_orders.model.ProductDetails;

@Repository
public interface PlacedOrdersRepository extends JpaRepository<OrderDetails, Integer>{

}
