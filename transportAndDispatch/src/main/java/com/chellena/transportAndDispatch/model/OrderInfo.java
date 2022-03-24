package com.chellena.transportAndDispatch.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

import static com.chellena.transportAndDispatch.constant.DBColumns.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity( name = "ORDER_INFO")

//@JsonTypeInfo( include=JsaonTypeInfo.As.WRAPPER_OBJECT, use =JSonTypeInfo.Id.NAME)
//@JsonInclude(JsoonInclude.Include.NON_EMPTY)
public class OrderInfo {


    @Id
    @Column(name= ORDER_ID)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String orderId;
    @Column(name=ORDER_TYPE)
    @NotNull(message = "OrderType cannot be null")
    private String orderType;
    @Column(name=PICkUP_DATE)
    @NotNull(message = "Pick up date cannot be null")
    @Temporal(TemporalType.DATE)
    private Date pickupDate;
    @Column(name=DROP_OFF_DATE)
    @NotNull(message = "Drop off time cannot be null")
    @Temporal(TemporalType.DATE)
    private Date dropOffDate;
//    @Column(name=PICKUP_TIME)
//    @NotNull(message = "Pick up time cannot be null")
//    @Temporal(TemporalType.DATE)
//    private Date pickupTime;
//    @Column(name=DROP_OFF_TIME)
//    @NotNull(message = "Drop off time cannot be null")
//    @Temporal(TemporalType.DATE)
//    private Date dropOffTime;
    @Column(name=PAYMENT_TYPE)
    @NotNull(message = "Drop off time cannot be null")
    private String paymentType;
    @Column(name=PAYMENT_AMOUNT)
    @NotNull(message = "Drop off time cannot be null")
    private double paymentAmount;
    @Column(name=REMAINING_BALANCE)
    @NotNull(message = "Drop off time cannot be null")
    private double remainingBalance;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = CUSTOMER_ID, nullable = false)
    private CustomerInfo customerInfo;
   }

//@Entity
//public class Office {
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumns({
//            @JoinColumn(name="ADDR_ID", referencedColumnName="ID"),
//            @JoinColumn(name="ADDR_ZIP", referencedColumnName="ZIP")
//    })
//    private Address address;
//}