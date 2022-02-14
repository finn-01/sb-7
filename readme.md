


> Written with [StackEdit](https://stackedit.io/).
# Spring Boot application config và @Value
### **Giới thiệu**

Trong thực tế không phải lúc nào chúng ta cũng nên để mọi thứ trong code của mình. Có những thông số tốt hơn hết nên được truyền từ bên ngoài vào ứng dụng, để giúp ứng dụng của bạn dễ dàng thay đổi giữa các môi trường khác nhau.

Để phục vụ điều này, chúng ta sẽ tìm hiểu về khái niệm config ứng dụng **Spring Boot** với `application.properties`

### **application.properties**

Trong **Spring Boot**, các thông tin cấu hình mặc định được lấy từ file `resources/applications.properties`.

### **@Value**

Trong trường hợp, bạn muốn tự config những giá trị của riêng mình, thì **Spring Boot** hỗ trợ bạn với annotation `@Value`

Ví dụ, tôi muốn cấu hình cho thông tin database của tôi từ bên ngoài ứng dụng

_application.properties_

```java
loda.mysql.url=jdbc:mysql://host1:33060/loda
```

`@Value` được sử dụng trên thuộc tính của class, Có nhiệm vụ lấy thông tin từ file properties và gán vào biến.

```java
public class AppConfig {
    // Lấy giá trị config từ file application.properties
    @Value("${loda.mysql.url}")
    String mysqlUrl;
}
```

Thông tin truyền vào annotation `@Value` chính là tên của cấu hình đặt trong dấu `${name}`