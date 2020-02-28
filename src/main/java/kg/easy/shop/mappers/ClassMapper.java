package kg.easy.shop.mappers;

import kg.easy.shop.models.dto.*;
import kg.easy.shop.models.entities.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClassMapper {
    ClassMapper INSTANCE = Mappers.getMapper(ClassMapper.class);

    Operation operationDtoToOperation(OperationDto operationDto);

    OperationDto operationToOperationDto(Operation operation);

    Customer customerDtoToCustomer(CustomerDto customerDto);

    CustomerDto customerToCustomerDto(Customer customer);

    CustomerPhone customerPhoneDtoToCustomerPhone(CustomerPhoneDto customerPhoneDto);

    CustomerPhoneDto customerPhoneToCustomerPhoneDto(CustomerPhone customerPhone);

    Income incomeDtoToIncome(IncomeDto incomeDto);
    IncomeDto incomeToIncomeDto(Income income);

    OperationDetail operationDetailDtoToOperationDetail(OperationDetailDto operationDetailDto);
    OperationDetailDto operationDetailToOperationDetailDto(OperationDetail operationDetail);

    Price priceDtoToPrice(PriceDto priceDto);
    PriceDto priceToPriceDto(Price price);

    ProductCategory productCategoryDtoToProductCategory(ProductCategoryDto productCategoryDto);
    ProductCategoryDto productCategoryToProductCategoryDto(ProductCategory productCategory);

    Product productDtoToProduct(ProductDto productDto);
    ProductDto productToProductDto(Product product);

    Supplier supplierDtoToSupplier(SupplierDto supplierDto);
    SupplierDto supplierToSupplierDto(Supplier supplier);

    SupplierPhone supplierPhoneDtoToSupplierPhone(SupplierPhoneDto supplierPhoneDto);
    SupplierPhoneDto supplierPhoneToSupplierPhoneDto(SupplierPhone supplierPhone);

    User userDtoToUser(UserDto userDto);
    UserDto userToUserDto(User user);

    UserPhone userPhoneDtoToUserPhone(UserPhoneDto userPhoneDto);
    UserPhoneDto userPhoneToUserPhoneDto(UserPhone userPhone);

    UserRole userRoleDtoToUserRole(UserRoleDto userRoleDto);
    UserRoleDto userRoleToUserRoleDto(UserRole userRole);

    UserStatus userStatusDtoToUserStatus(UserStatusDto userStatusDto);
    UserStatusDto userStatusToUserStatusDto(UserStatus userStatus);

    List<UserStatus> userStatusListDtoToListUserStatusList(List<UserStatusDto> userStatusDtoList);
    List<UserStatusDto> userStatusListToListUserStatusDtoList(List<UserStatus> userStatusList);

    List<User> userDtoListToUserList(List<UserDto> userDtoList);
    List<UserDto> userListToUserDtoList(List<User> userList);

    List<Supplier> supplierDtoListToSupplierList(List<SupplierDto> supplierDtoList);
    List<SupplierDto> supplierListToSupplierDtoList(List<Supplier> supplierList);

    List<Customer> customerDtoListToCustomerList(List<CustomerDto> customerDtoList);
    List<CustomerDto> customerListToCustomerDtoList(List<Customer> customerList);

    List<UserPhone> userPhoneDtoListToUserPhoneList(List<UserPhoneDto> userPhoneDtoList);
    List<UserPhoneDto> userPhoneListToUserPhoneDtoList(List<UserPhone> userPhoneList);

    List<Product> productDtoListToProductList(List<ProductDto> productDtoList);
    List<ProductDto> productListToProductDtoList(List<Product> productList);

}
