
package dataservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dataservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddCriminal_QNAME = new QName("http://DataService/", "Add_Criminal");
    private final static QName _AddCriminalResponse_QNAME = new QName("http://DataService/", "Add_CriminalResponse");
    private final static QName _AddUser_QNAME = new QName("http://DataService/", "Add_User");
    private final static QName _AddUserResponse_QNAME = new QName("http://DataService/", "Add_UserResponse");
    private final static QName _AddVehicle_QNAME = new QName("http://DataService/", "Add_Vehicle");
    private final static QName _AddVehicleResponse_QNAME = new QName("http://DataService/", "Add_VehicleResponse");
    private final static QName _AllCriminalInfo_QNAME = new QName("http://DataService/", "AllCriminalInfo");
    private final static QName _AllCriminalInfoResponse_QNAME = new QName("http://DataService/", "AllCriminalInfoResponse");
    private final static QName _AllVehicleInfo_QNAME = new QName("http://DataService/", "All_vehicleInfo");
    private final static QName _AllVehicleInfoResponse_QNAME = new QName("http://DataService/", "All_vehicleInfoResponse");
    private final static QName _Allusers_QNAME = new QName("http://DataService/", "Allusers");
    private final static QName _AllusersResponse_QNAME = new QName("http://DataService/", "AllusersResponse");
    private final static QName _Changepassword_QNAME = new QName("http://DataService/", "Changepassword");
    private final static QName _ChangepasswordResponse_QNAME = new QName("http://DataService/", "ChangepasswordResponse");
    private final static QName _DeleteCriminal_QNAME = new QName("http://DataService/", "Delete_Criminal");
    private final static QName _DeleteCriminalResponse_QNAME = new QName("http://DataService/", "Delete_CriminalResponse");
    private final static QName _DeleteUser_QNAME = new QName("http://DataService/", "Delete_User");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://DataService/", "Delete_UserResponse");
    private final static QName _DeleteVehicle_QNAME = new QName("http://DataService/", "Delete_Vehicle");
    private final static QName _DeleteVehicleResponse_QNAME = new QName("http://DataService/", "Delete_VehicleResponse");
    private final static QName _Exception_QNAME = new QName("http://DataService/", "Exception");
    private final static QName _Login_QNAME = new QName("http://DataService/", "Login");
    private final static QName _LoginResponse_QNAME = new QName("http://DataService/", "LoginResponse");
    private final static QName _SearchCriminalInfo_QNAME = new QName("http://DataService/", "SearchCriminalInfo");
    private final static QName _SearchCriminalInfoResponse_QNAME = new QName("http://DataService/", "SearchCriminalInfoResponse");
    private final static QName _SearchUser_QNAME = new QName("http://DataService/", "SearchUser");
    private final static QName _SearchUserResponse_QNAME = new QName("http://DataService/", "SearchUserResponse");
    private final static QName _SearchVehicle_QNAME = new QName("http://DataService/", "SearchVehicle");
    private final static QName _SearchVehicleInfo_QNAME = new QName("http://DataService/", "SearchVehicleInfo");
    private final static QName _SearchVehicleInfoResponse_QNAME = new QName("http://DataService/", "SearchVehicleInfoResponse");
    private final static QName _SearchVehicleResponse_QNAME = new QName("http://DataService/", "SearchVehicleResponse");
    private final static QName _UpdateCriminal_QNAME = new QName("http://DataService/", "Update_Criminal");
    private final static QName _UpdateCriminalResponse_QNAME = new QName("http://DataService/", "Update_CriminalResponse");
    private final static QName _UpdateUser_QNAME = new QName("http://DataService/", "Update_User");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://DataService/", "Update_UserResponse");
    private final static QName _UpdateVehicle_QNAME = new QName("http://DataService/", "Update_Vehicle");
    private final static QName _UpdateVehicleResponse_QNAME = new QName("http://DataService/", "Update_VehicleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dataservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCriminal }
     * 
     */
    public AddCriminal createAddCriminal() {
        return new AddCriminal();
    }

    /**
     * Create an instance of {@link AddCriminalResponse }
     * 
     */
    public AddCriminalResponse createAddCriminalResponse() {
        return new AddCriminalResponse();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link AddVehicle }
     * 
     */
    public AddVehicle createAddVehicle() {
        return new AddVehicle();
    }

    /**
     * Create an instance of {@link AddVehicleResponse }
     * 
     */
    public AddVehicleResponse createAddVehicleResponse() {
        return new AddVehicleResponse();
    }

    /**
     * Create an instance of {@link AllCriminalInfo }
     * 
     */
    public AllCriminalInfo createAllCriminalInfo() {
        return new AllCriminalInfo();
    }

    /**
     * Create an instance of {@link AllCriminalInfoResponse }
     * 
     */
    public AllCriminalInfoResponse createAllCriminalInfoResponse() {
        return new AllCriminalInfoResponse();
    }

    /**
     * Create an instance of {@link AllVehicleInfo }
     * 
     */
    public AllVehicleInfo createAllVehicleInfo() {
        return new AllVehicleInfo();
    }

    /**
     * Create an instance of {@link AllVehicleInfoResponse }
     * 
     */
    public AllVehicleInfoResponse createAllVehicleInfoResponse() {
        return new AllVehicleInfoResponse();
    }

    /**
     * Create an instance of {@link Allusers }
     * 
     */
    public Allusers createAllusers() {
        return new Allusers();
    }

    /**
     * Create an instance of {@link AllusersResponse }
     * 
     */
    public AllusersResponse createAllusersResponse() {
        return new AllusersResponse();
    }

    /**
     * Create an instance of {@link Changepassword }
     * 
     */
    public Changepassword createChangepassword() {
        return new Changepassword();
    }

    /**
     * Create an instance of {@link ChangepasswordResponse }
     * 
     */
    public ChangepasswordResponse createChangepasswordResponse() {
        return new ChangepasswordResponse();
    }

    /**
     * Create an instance of {@link DeleteCriminal }
     * 
     */
    public DeleteCriminal createDeleteCriminal() {
        return new DeleteCriminal();
    }

    /**
     * Create an instance of {@link DeleteCriminalResponse }
     * 
     */
    public DeleteCriminalResponse createDeleteCriminalResponse() {
        return new DeleteCriminalResponse();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link DeleteVehicle }
     * 
     */
    public DeleteVehicle createDeleteVehicle() {
        return new DeleteVehicle();
    }

    /**
     * Create an instance of {@link DeleteVehicleResponse }
     * 
     */
    public DeleteVehicleResponse createDeleteVehicleResponse() {
        return new DeleteVehicleResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link SearchCriminalInfo }
     * 
     */
    public SearchCriminalInfo createSearchCriminalInfo() {
        return new SearchCriminalInfo();
    }

    /**
     * Create an instance of {@link SearchCriminalInfoResponse }
     * 
     */
    public SearchCriminalInfoResponse createSearchCriminalInfoResponse() {
        return new SearchCriminalInfoResponse();
    }

    /**
     * Create an instance of {@link SearchUser }
     * 
     */
    public SearchUser createSearchUser() {
        return new SearchUser();
    }

    /**
     * Create an instance of {@link SearchUserResponse }
     * 
     */
    public SearchUserResponse createSearchUserResponse() {
        return new SearchUserResponse();
    }

    /**
     * Create an instance of {@link SearchVehicle }
     * 
     */
    public SearchVehicle createSearchVehicle() {
        return new SearchVehicle();
    }

    /**
     * Create an instance of {@link SearchVehicleInfo }
     * 
     */
    public SearchVehicleInfo createSearchVehicleInfo() {
        return new SearchVehicleInfo();
    }

    /**
     * Create an instance of {@link SearchVehicleInfoResponse }
     * 
     */
    public SearchVehicleInfoResponse createSearchVehicleInfoResponse() {
        return new SearchVehicleInfoResponse();
    }

    /**
     * Create an instance of {@link SearchVehicleResponse }
     * 
     */
    public SearchVehicleResponse createSearchVehicleResponse() {
        return new SearchVehicleResponse();
    }

    /**
     * Create an instance of {@link UpdateCriminal }
     * 
     */
    public UpdateCriminal createUpdateCriminal() {
        return new UpdateCriminal();
    }

    /**
     * Create an instance of {@link UpdateCriminalResponse }
     * 
     */
    public UpdateCriminalResponse createUpdateCriminalResponse() {
        return new UpdateCriminalResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link UpdateVehicle }
     * 
     */
    public UpdateVehicle createUpdateVehicle() {
        return new UpdateVehicle();
    }

    /**
     * Create an instance of {@link UpdateVehicleResponse }
     * 
     */
    public UpdateVehicleResponse createUpdateVehicleResponse() {
        return new UpdateVehicleResponse();
    }

    /**
     * Create an instance of {@link VehicleInfo }
     * 
     */
    public VehicleInfo createVehicleInfo() {
        return new VehicleInfo();
    }

    /**
     * Create an instance of {@link CriminalInfo }
     * 
     */
    public CriminalInfo createCriminalInfo() {
        return new CriminalInfo();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCriminal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Add_Criminal")
    public JAXBElement<AddCriminal> createAddCriminal(AddCriminal value) {
        return new JAXBElement<AddCriminal>(_AddCriminal_QNAME, AddCriminal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCriminalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Add_CriminalResponse")
    public JAXBElement<AddCriminalResponse> createAddCriminalResponse(AddCriminalResponse value) {
        return new JAXBElement<AddCriminalResponse>(_AddCriminalResponse_QNAME, AddCriminalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Add_User")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Add_UserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVehicle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Add_Vehicle")
    public JAXBElement<AddVehicle> createAddVehicle(AddVehicle value) {
        return new JAXBElement<AddVehicle>(_AddVehicle_QNAME, AddVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVehicleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Add_VehicleResponse")
    public JAXBElement<AddVehicleResponse> createAddVehicleResponse(AddVehicleResponse value) {
        return new JAXBElement<AddVehicleResponse>(_AddVehicleResponse_QNAME, AddVehicleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllCriminalInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "AllCriminalInfo")
    public JAXBElement<AllCriminalInfo> createAllCriminalInfo(AllCriminalInfo value) {
        return new JAXBElement<AllCriminalInfo>(_AllCriminalInfo_QNAME, AllCriminalInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllCriminalInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "AllCriminalInfoResponse")
    public JAXBElement<AllCriminalInfoResponse> createAllCriminalInfoResponse(AllCriminalInfoResponse value) {
        return new JAXBElement<AllCriminalInfoResponse>(_AllCriminalInfoResponse_QNAME, AllCriminalInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllVehicleInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "All_vehicleInfo")
    public JAXBElement<AllVehicleInfo> createAllVehicleInfo(AllVehicleInfo value) {
        return new JAXBElement<AllVehicleInfo>(_AllVehicleInfo_QNAME, AllVehicleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllVehicleInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "All_vehicleInfoResponse")
    public JAXBElement<AllVehicleInfoResponse> createAllVehicleInfoResponse(AllVehicleInfoResponse value) {
        return new JAXBElement<AllVehicleInfoResponse>(_AllVehicleInfoResponse_QNAME, AllVehicleInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Allusers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Allusers")
    public JAXBElement<Allusers> createAllusers(Allusers value) {
        return new JAXBElement<Allusers>(_Allusers_QNAME, Allusers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllusersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "AllusersResponse")
    public JAXBElement<AllusersResponse> createAllusersResponse(AllusersResponse value) {
        return new JAXBElement<AllusersResponse>(_AllusersResponse_QNAME, AllusersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Changepassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Changepassword")
    public JAXBElement<Changepassword> createChangepassword(Changepassword value) {
        return new JAXBElement<Changepassword>(_Changepassword_QNAME, Changepassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangepasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "ChangepasswordResponse")
    public JAXBElement<ChangepasswordResponse> createChangepasswordResponse(ChangepasswordResponse value) {
        return new JAXBElement<ChangepasswordResponse>(_ChangepasswordResponse_QNAME, ChangepasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCriminal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Delete_Criminal")
    public JAXBElement<DeleteCriminal> createDeleteCriminal(DeleteCriminal value) {
        return new JAXBElement<DeleteCriminal>(_DeleteCriminal_QNAME, DeleteCriminal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCriminalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Delete_CriminalResponse")
    public JAXBElement<DeleteCriminalResponse> createDeleteCriminalResponse(DeleteCriminalResponse value) {
        return new JAXBElement<DeleteCriminalResponse>(_DeleteCriminalResponse_QNAME, DeleteCriminalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Delete_User")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Delete_UserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVehicle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Delete_Vehicle")
    public JAXBElement<DeleteVehicle> createDeleteVehicle(DeleteVehicle value) {
        return new JAXBElement<DeleteVehicle>(_DeleteVehicle_QNAME, DeleteVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVehicleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Delete_VehicleResponse")
    public JAXBElement<DeleteVehicleResponse> createDeleteVehicleResponse(DeleteVehicleResponse value) {
        return new JAXBElement<DeleteVehicleResponse>(_DeleteVehicleResponse_QNAME, DeleteVehicleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriminalInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "SearchCriminalInfo")
    public JAXBElement<SearchCriminalInfo> createSearchCriminalInfo(SearchCriminalInfo value) {
        return new JAXBElement<SearchCriminalInfo>(_SearchCriminalInfo_QNAME, SearchCriminalInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCriminalInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "SearchCriminalInfoResponse")
    public JAXBElement<SearchCriminalInfoResponse> createSearchCriminalInfoResponse(SearchCriminalInfoResponse value) {
        return new JAXBElement<SearchCriminalInfoResponse>(_SearchCriminalInfoResponse_QNAME, SearchCriminalInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "SearchUser")
    public JAXBElement<SearchUser> createSearchUser(SearchUser value) {
        return new JAXBElement<SearchUser>(_SearchUser_QNAME, SearchUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "SearchUserResponse")
    public JAXBElement<SearchUserResponse> createSearchUserResponse(SearchUserResponse value) {
        return new JAXBElement<SearchUserResponse>(_SearchUserResponse_QNAME, SearchUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchVehicle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "SearchVehicle")
    public JAXBElement<SearchVehicle> createSearchVehicle(SearchVehicle value) {
        return new JAXBElement<SearchVehicle>(_SearchVehicle_QNAME, SearchVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchVehicleInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "SearchVehicleInfo")
    public JAXBElement<SearchVehicleInfo> createSearchVehicleInfo(SearchVehicleInfo value) {
        return new JAXBElement<SearchVehicleInfo>(_SearchVehicleInfo_QNAME, SearchVehicleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchVehicleInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "SearchVehicleInfoResponse")
    public JAXBElement<SearchVehicleInfoResponse> createSearchVehicleInfoResponse(SearchVehicleInfoResponse value) {
        return new JAXBElement<SearchVehicleInfoResponse>(_SearchVehicleInfoResponse_QNAME, SearchVehicleInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchVehicleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "SearchVehicleResponse")
    public JAXBElement<SearchVehicleResponse> createSearchVehicleResponse(SearchVehicleResponse value) {
        return new JAXBElement<SearchVehicleResponse>(_SearchVehicleResponse_QNAME, SearchVehicleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCriminal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Update_Criminal")
    public JAXBElement<UpdateCriminal> createUpdateCriminal(UpdateCriminal value) {
        return new JAXBElement<UpdateCriminal>(_UpdateCriminal_QNAME, UpdateCriminal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCriminalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Update_CriminalResponse")
    public JAXBElement<UpdateCriminalResponse> createUpdateCriminalResponse(UpdateCriminalResponse value) {
        return new JAXBElement<UpdateCriminalResponse>(_UpdateCriminalResponse_QNAME, UpdateCriminalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Update_User")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Update_UserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVehicle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Update_Vehicle")
    public JAXBElement<UpdateVehicle> createUpdateVehicle(UpdateVehicle value) {
        return new JAXBElement<UpdateVehicle>(_UpdateVehicle_QNAME, UpdateVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVehicleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DataService/", name = "Update_VehicleResponse")
    public JAXBElement<UpdateVehicleResponse> createUpdateVehicleResponse(UpdateVehicleResponse value) {
        return new JAXBElement<UpdateVehicleResponse>(_UpdateVehicleResponse_QNAME, UpdateVehicleResponse.class, null, value);
    }

}
