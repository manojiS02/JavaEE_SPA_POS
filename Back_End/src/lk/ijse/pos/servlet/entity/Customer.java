package lk.ijse.pos.servlet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Customer {
    String CusId;
    String CustName;
    String address;
    double salary;
}
