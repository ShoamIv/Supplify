package com.Supplify.Supplify.repositories;

import com.Supplify.Supplify.DTO.OrderProductDetails;
import com.Supplify.Supplify.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order, Integer> {

    List<Order> findByStatus(String pending);

    @Query("SELECT DISTINCT o FROM Order o WHERE o.business.id = :businessId")
    List<Order> findByBusinessId(@Param("businessId") int businessId);

    @Query("""
                SELECT new com.Supplify.Supplify.DTO.OrderProductDetails(
                   \s
                    p.productName,
                    op.quantity,
                    op.unitPrice,
                    (op.quantity * op.unitPrice),
                    o.status,
                    o.user.firstName,
                    o.agent.supplier.companyName
                )
                FROM OrderProduct op
                JOIN op.product p
                JOIN Order o ON op.id.orderId = o.id
                WHERE op.id.orderId = :orderId
           \s""")
    List<OrderProductDetails> findOrderProductDetailsByOrderId(@Param("orderId") int orderId);



}

