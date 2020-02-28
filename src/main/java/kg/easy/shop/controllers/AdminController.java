package kg.easy.shop.controllers;

import io.swagger.annotations.*;
import io.swagger.models.auth.In;
import kg.easy.shop.mappers.ClassMapper;
import kg.easy.shop.models.dto.*;
import kg.easy.shop.models.entities.*;
import kg.easy.shop.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "Контроллер администратора2", description = "Контроллер администратора3")
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @RequestMapping(value = "/user_status/save", method = RequestMethod.POST)
    @ApiOperation(value = "Сохранение статуса пользователя", response = List.class)
    public ResponseEntity<?> saveUserStatus(@RequestBody UserStatusDto userStatusDto) {
        UserStatus userStatus = ClassMapper.INSTANCE.userStatusDtoToUserStatus(userStatusDto);
        return new ResponseEntity<>(adminService.saveUserStatus(userStatus), HttpStatus.OK);
    }

    @RequestMapping(value = "/user_status/all", method = RequestMethod.GET)
    @ApiOperation(value = "View a list of available user statuses", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public ResponseEntity<?> getUserStatusList() {
        List<UserStatus> userStatusList = adminService.getUserStatusList();
        List<UserStatusDto> userStatusDtoList = ClassMapper.INSTANCE.userStatusListToListUserStatusDtoList(userStatusList);
        return new ResponseEntity<>(userStatusDtoList, HttpStatus.OK);
    }

    @RequestMapping(value = "/user/save", method = RequestMethod.POST)
    public ResponseEntity<?> saveUser(@ApiParam(value = "Пользователь которого необходимо сохранить", required = true)@RequestBody UserDto userDto) {
        User user = ClassMapper.INSTANCE.userDtoToUser(userDto);
        user = adminService.saveUser(user);
        userDto = ClassMapper.INSTANCE.userToUserDto(user);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

    @RequestMapping(value = "/user/all", method = RequestMethod.GET)
    public ResponseEntity<?> getUserList() {
        List<User> userList = adminService.getUserList();
        List<UserDto> userDtoList = ClassMapper.INSTANCE.userListToUserDtoList(userList);
        return new ResponseEntity<>(userDtoList, HttpStatus.OK);
    }

    @RequestMapping(value = "/supplier/save", method = RequestMethod.POST)
    public ResponseEntity<?> saveSupplier(@RequestBody SupplierDto supplierDto) {
        Supplier supplier = ClassMapper.INSTANCE.supplierDtoToSupplier(supplierDto);
        supplier = adminService.saveSupplier(supplier);
        supplierDto = ClassMapper.INSTANCE.supplierToSupplierDto(supplier);
        return new ResponseEntity<>(supplierDto, HttpStatus.OK);
    }

    @RequestMapping(value = "/supplier/all", method = RequestMethod.GET)
    public ResponseEntity<?> getSupplierList() {
        List<Supplier> supplierList = adminService.getSupplierList();
        List<SupplierDto> supplierDtoList = ClassMapper.INSTANCE.supplierListToSupplierDtoList(supplierList);
        return new ResponseEntity<>(supplierDtoList, HttpStatus.OK);
    }

    @RequestMapping(value = "/customer/save", method = RequestMethod.POST)
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerDto customerDto) {
        Customer customer = ClassMapper.INSTANCE.customerDtoToCustomer(customerDto);
        customer = adminService.saveCustomer(customer);
        customerDto = ClassMapper.INSTANCE.customerToCustomerDto(customer);
        return new ResponseEntity<>(customerDto, HttpStatus.OK);
    }

    @RequestMapping(value = "/customer/all", method = RequestMethod.GET)
    public ResponseEntity<?> getCustomerList() {
        List<Customer> customerList = adminService.getCustomerList();
        List<CustomerDto> customerDtoList = ClassMapper.INSTANCE.customerListToCustomerDtoList(customerList);
        return new ResponseEntity<>(customerDtoList, HttpStatus.OK);
    }

    @RequestMapping(value = "/user_phone/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUserPhoneList(@PathVariable Long id) {
        List<UserPhone> userPhoneList = adminService.getUserPhoneList(id);
        List<UserPhoneDto> userPhoneDtoList = ClassMapper.INSTANCE.userPhoneListToUserPhoneDtoList(userPhoneList);
        return new ResponseEntity<>(userPhoneDtoList, HttpStatus.OK);
    }

    @RequestMapping(value = "/product/save", method = RequestMethod.POST)
    public ResponseEntity<?> saveProduct(@RequestBody ProductDto productDto) {
        Product product = ClassMapper.INSTANCE.productDtoToProduct(productDto);
        product = adminService.saveProduct(product);
        ProductDto productDto1 = ClassMapper.INSTANCE.productToProductDto(product);
        return new ResponseEntity<>(productDto1, HttpStatus.OK);
    }

    @RequestMapping(value = "/product/all", method = RequestMethod.GET)
    public ResponseEntity<?> getProductList() {
        List<Product> productList = adminService.getProductList();
        List<ProductDto> productDtoList = ClassMapper.INSTANCE.productListToProductDtoList(productList);
        return new ResponseEntity<>(productDtoList, HttpStatus.OK);
    }

    @PostMapping("/income/save")
    public ResponseEntity<?> saveIncome(@RequestBody IncomeDto incomeDto) {
        Income income = ClassMapper.INSTANCE.incomeDtoToIncome(incomeDto);
        income = adminService.saveIncome(income);
        IncomeDto incomeDto1 = ClassMapper.INSTANCE.incomeToIncomeDto(income);
        return new ResponseEntity<>(incomeDto1, HttpStatus.OK);
    }

}
