
package businessservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the businessservice package. 
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

    private final static QName _Adduser_QNAME = new QName("http://BusinessService/", "Adduser");
    private final static QName _AdduserResponse_QNAME = new QName("http://BusinessService/", "AdduserResponse");
    private final static QName _Addvehicle_QNAME = new QName("http://BusinessService/", "Addvehicle");
    private final static QName _AddvehicleResponse_QNAME = new QName("http://BusinessService/", "AddvehicleResponse");
    private final static QName _Allcriminalinfo_QNAME = new QName("http://BusinessService/", "Allcriminalinfo");
    private final static QName _AllcriminalinfoResponse_QNAME = new QName("http://BusinessService/", "AllcriminalinfoResponse");
    private final static QName _Allusers_QNAME = new QName("http://BusinessService/", "Allusers");
    private final static QName _AllusersResponse_QNAME = new QName("http://BusinessService/", "AllusersResponse");
    private final static QName _AllvehicleInfo_QNAME = new QName("http://BusinessService/", "AllvehicleInfo");
    private final static QName _AllvehicleInfoResponse_QNAME = new QName("http://BusinessService/", "AllvehicleInfoResponse");
    private final static QName _Changepassword_QNAME = new QName("http://BusinessService/", "Changepassword");
    private final static QName _ChangepasswordResponse_QNAME = new QName("http://BusinessService/", "ChangepasswordResponse");
    private final static QName _Deleteuser_QNAME = new QName("http://BusinessService/", "Deleteuser");
    private final static QName _DeleteuserResponse_QNAME = new QName("http://BusinessService/", "DeleteuserResponse");
    private final static QName _Deletevehicle_QNAME = new QName("http://BusinessService/", "Deletevehicle");
    private final static QName _DeletevehicleResponse_QNAME = new QName("http://BusinessService/", "DeletevehicleResponse");
    private final static QName _Login_QNAME = new QName("http://BusinessService/", "Login");
    private final static QName _LoginResponse_QNAME = new QName("http://BusinessService/", "LoginResponse");
    private final static QName _SearchVehicleInfo_QNAME = new QName("http://BusinessService/", "SearchVehicleInfo");
    private final static QName _SearchVehicleInfoResponse_QNAME = new QName("http://BusinessService/", "SearchVehicleInfoResponse");
    private final static QName _Searchcriminalhostory_QNAME = new QName("http://BusinessService/", "Searchcriminalhostory");
    private final static QName _SearchcriminalhostoryResponse_QNAME = new QName("http://BusinessService/", "SearchcriminalhostoryResponse");
    private final static QName _Searchcriminals_QNAME = new QName("http://BusinessService/", "Searchcriminals");
    private final static QName _SearchcriminalsResponse_QNAME = new QName("http://BusinessService/", "SearchcriminalsResponse");
    private final static QName _Searchuser_QNAME = new QName("http://BusinessService/", "Searchuser");
    private final static QName _SearchuserResponse_QNAME = new QName("http://BusinessService/", "SearchuserResponse");
    private final static QName _Searchvehicle_QNAME = new QName("http://BusinessService/", "Searchvehicle");
    private final static QName _SearchvehicleResponse_QNAME = new QName("http://BusinessService/", "SearchvehicleResponse");
    private final static QName _Updateuser_QNAME = new QName("http://BusinessService/", "Updateuser");
    private final static QName _UpdateuserResponse_QNAME = new QName("http://BusinessService/", "UpdateuserResponse");
    private final static QName _Updatevehicle_QNAME = new QName("http://BusinessService/", "Updatevehicle");
    private final static QName _UpdatevehicleResponse_QNAME = new QName("http://BusinessService/", "UpdatevehicleResponse");
    private final static QName _Hello_QNAME = new QName("http://BusinessService/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://BusinessService/", "helloResponse");
    private final static QName _Sendmessage_QNAME = new QName("http://BusinessService/", "sendmessage");
    private final static QName _SendmessageResponse_QNAME = new QName("http://BusinessService/", "sendmessageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: businessservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Adduser }
     * 
     */
    public Adduser createAdduser() {
        return new Adduser();
    }

    /**
     * Create an instance of {@link AdduserResponse }
     * 
     */
    public AdduserResponse createAdduserResponse() {
        return new AdduserResponse();
    }

    /**
     * Create an instance of {@link Addvehicle }
     * 
     */
    public Addvehicle createAddvehicle() {
        return new Addvehicle();
    }

    /**
     * Create an instance of {@link AddvehicleResponse }
     * 
     */
    public AddvehicleResponse createAddvehicleResponse() {
        return new AddvehicleResponse();
    }

    /**
     * Create an instance of {@link Allcriminalinfo }
     * 
     */
    public Allcriminalinfo createAllcriminalinfo() {
        return new Allcriminalinfo();
    }

    /**
     * Create an instance of {@link AllcriminalinfoResponse }
     * 
     */
    public AllcriminalinfoResponse createAllcriminalinfoResponse() {
        return new AllcriminalinfoResponse();
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
     * Create an instance of {@link AllvehicleInfo }
     * 
     */
    public AllvehicleInfo createAllvehicleInfo() {
        return new AllvehicleInfo();
    }

    /**
     * Create an instance of {@link AllvehicleInfoResponse }
     * 
     */
    public AllvehicleInfoResponse createAllvehicleInfoResponse() {
        return new AllvehicleInfoResponse();
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
     * Create an instance of {@link Deleteuser }
     * 
     */
    public Deleteuser createDeleteuser() {
        return new Deleteuser();
    }

    /**
     * Create an instance of {@link DeleteuserResponse }
     * 
     */
    public DeleteuserResponse createDeleteuserResponse() {
        return new DeleteuserResponse();
    }

    /**
     * Create an instance of {@link Deletevehicle }
     * 
     */
    public Deletevehicle createDeletevehicle() {
        return new Deletevehicle();
    }

    /**
     * Create an instance of {@link DeletevehicleResponse }
     * 
     */
    public DeletevehicleResponse createDeletevehicleResponse() {
        return new DeletevehicleResponse();
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
     * Create an instance of {@link Searchcriminalhostory }
     * 
     */
    public Searchcriminalhostory createSearchcriminalhostory() {
        return new Searchcriminalhostory();
    }

    /**
     * Create an instance of {@link SearchcriminalhostoryResponse }
     * 
     */
    public SearchcriminalhostoryResponse createSearchcriminalhostoryResponse() {
        return new SearchcriminalhostoryResponse();
    }

    /**
     * Create an instance of {@link Searchcriminals }
     * 
     */
    public Searchcriminals createSearchcriminals() {
        return new Searchcriminals();
    }

    /**
     * Create an instance of {@link SearchcriminalsResponse }
     * 
     */
    public SearchcriminalsResponse createSearchcriminalsResponse() {
        return new SearchcriminalsResponse();
    }

    /**
     * Create an instance of {@link Searchuser }
     * 
     */
    public Searchuser createSearchuser() {
        return new Searchuser();
    }

    /**
     * Create an instance of {@link SearchuserResponse }
     * 
     */
    public SearchuserResponse createSearchuserResponse() {
        return new SearchuserResponse();
    }

    /**
     * Create an instance of {@link Searchvehicle }
     * 
     */
    public Searchvehicle createSearchvehicle() {
        return new Searchvehicle();
    }

    /**
     * Create an instance of {@link SearchvehicleResponse }
     * 
     */
    public SearchvehicleResponse createSearchvehicleResponse() {
        return new SearchvehicleResponse();
    }

    /**
     * Create an instance of {@link Updateuser }
     * 
     */
    public Updateuser createUpdateuser() {
        return new Updateuser();
    }

    /**
     * Create an instance of {@link UpdateuserResponse }
     * 
     */
    public UpdateuserResponse createUpdateuserResponse() {
        return new UpdateuserResponse();
    }

    /**
     * Create an instance of {@link Updatevehicle }
     * 
     */
    public Updatevehicle createUpdatevehicle() {
        return new Updatevehicle();
    }

    /**
     * Create an instance of {@link UpdatevehicleResponse }
     * 
     */
    public UpdatevehicleResponse createUpdatevehicleResponse() {
        return new UpdatevehicleResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Sendmessage }
     * 
     */
    public Sendmessage createSendmessage() {
        return new Sendmessage();
    }

    /**
     * Create an instance of {@link SendmessageResponse }
     * 
     */
    public SendmessageResponse createSendmessageResponse() {
        return new SendmessageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Adduser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "Adduser")
    public JAXBElement<Adduser> createAdduser(Adduser value) {
        return new JAXBElement<Adduser>(_Adduser_QNAME, Adduser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdduserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "AdduserResponse")
    public JAXBElement<AdduserResponse> createAdduserResponse(AdduserResponse value) {
        return new JAXBElement<AdduserResponse>(_AdduserResponse_QNAME, AdduserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addvehicle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "Addvehicle")
    public JAXBElement<Addvehicle> createAddvehicle(Addvehicle value) {
        return new JAXBElement<Addvehicle>(_Addvehicle_QNAME, Addvehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddvehicleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "AddvehicleResponse")
    public JAXBElement<AddvehicleResponse> createAddvehicleResponse(AddvehicleResponse value) {
        return new JAXBElement<AddvehicleResponse>(_AddvehicleResponse_QNAME, AddvehicleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Allcriminalinfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "Allcriminalinfo")
    public JAXBElement<Allcriminalinfo> createAllcriminalinfo(Allcriminalinfo value) {
        return new JAXBElement<Allcriminalinfo>(_Allcriminalinfo_QNAME, Allcriminalinfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllcriminalinfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "AllcriminalinfoResponse")
    public JAXBElement<AllcriminalinfoResponse> createAllcriminalinfoResponse(AllcriminalinfoResponse value) {
        return new JAXBElement<AllcriminalinfoResponse>(_AllcriminalinfoResponse_QNAME, AllcriminalinfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Allusers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "Allusers")
    public JAXBElement<Allusers> createAllusers(Allusers value) {
        return new JAXBElement<Allusers>(_Allusers_QNAME, Allusers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllusersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "AllusersResponse")
    public JAXBElement<AllusersResponse> createAllusersResponse(AllusersResponse value) {
        return new JAXBElement<AllusersResponse>(_AllusersResponse_QNAME, AllusersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllvehicleInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "AllvehicleInfo")
    public JAXBElement<AllvehicleInfo> createAllvehicleInfo(AllvehicleInfo value) {
        return new JAXBElement<AllvehicleInfo>(_AllvehicleInfo_QNAME, AllvehicleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllvehicleInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "AllvehicleInfoResponse")
    public JAXBElement<AllvehicleInfoResponse> createAllvehicleInfoResponse(AllvehicleInfoResponse value) {
        return new JAXBElement<AllvehicleInfoResponse>(_AllvehicleInfoResponse_QNAME, AllvehicleInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Changepassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "Changepassword")
    public JAXBElement<Changepassword> createChangepassword(Changepassword value) {
        return new JAXBElement<Changepassword>(_Changepassword_QNAME, Changepassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangepasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "ChangepasswordResponse")
    public JAXBElement<ChangepasswordResponse> createChangepasswordResponse(ChangepasswordResponse value) {
        return new JAXBElement<ChangepasswordResponse>(_ChangepasswordResponse_QNAME, ChangepasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deleteuser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "Deleteuser")
    public JAXBElement<Deleteuser> createDeleteuser(Deleteuser value) {
        return new JAXBElement<Deleteuser>(_Deleteuser_QNAME, Deleteuser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteuserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "DeleteuserResponse")
    public JAXBElement<DeleteuserResponse> createDeleteuserResponse(DeleteuserResponse value) {
        return new JAXBElement<DeleteuserResponse>(_DeleteuserResponse_QNAME, DeleteuserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deletevehicle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "Deletevehicle")
    public JAXBElement<Deletevehicle> createDeletevehicle(Deletevehicle value) {
        return new JAXBElement<Deletevehicle>(_Deletevehicle_QNAME, Deletevehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletevehicleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "DeletevehicleResponse")
    public JAXBElement<DeletevehicleResponse> createDeletevehicleResponse(DeletevehicleResponse value) {
        return new JAXBElement<DeletevehicleResponse>(_DeletevehicleResponse_QNAME, DeletevehicleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchVehicleInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "SearchVehicleInfo")
    public JAXBElement<SearchVehicleInfo> createSearchVehicleInfo(SearchVehicleInfo value) {
        return new JAXBElement<SearchVehicleInfo>(_SearchVehicleInfo_QNAME, SearchVehicleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchVehicleInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "SearchVehicleInfoResponse")
    public JAXBElement<SearchVehicleInfoResponse> createSearchVehicleInfoResponse(SearchVehicleInfoResponse value) {
        return new JAXBElement<SearchVehicleInfoResponse>(_SearchVehicleInfoResponse_QNAME, SearchVehicleInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Searchcriminalhostory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "Searchcriminalhostory")
    public JAXBElement<Searchcriminalhostory> createSearchcriminalhostory(Searchcriminalhostory value) {
        return new JAXBElement<Searchcriminalhostory>(_Searchcriminalhostory_QNAME, Searchcriminalhostory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchcriminalhostoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "SearchcriminalhostoryResponse")
    public JAXBElement<SearchcriminalhostoryResponse> createSearchcriminalhostoryResponse(SearchcriminalhostoryResponse value) {
        return new JAXBElement<SearchcriminalhostoryResponse>(_SearchcriminalhostoryResponse_QNAME, SearchcriminalhostoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Searchcriminals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "Searchcriminals")
    public JAXBElement<Searchcriminals> createSearchcriminals(Searchcriminals value) {
        return new JAXBElement<Searchcriminals>(_Searchcriminals_QNAME, Searchcriminals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchcriminalsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "SearchcriminalsResponse")
    public JAXBElement<SearchcriminalsResponse> createSearchcriminalsResponse(SearchcriminalsResponse value) {
        return new JAXBElement<SearchcriminalsResponse>(_SearchcriminalsResponse_QNAME, SearchcriminalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Searchuser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "Searchuser")
    public JAXBElement<Searchuser> createSearchuser(Searchuser value) {
        return new JAXBElement<Searchuser>(_Searchuser_QNAME, Searchuser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchuserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "SearchuserResponse")
    public JAXBElement<SearchuserResponse> createSearchuserResponse(SearchuserResponse value) {
        return new JAXBElement<SearchuserResponse>(_SearchuserResponse_QNAME, SearchuserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Searchvehicle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "Searchvehicle")
    public JAXBElement<Searchvehicle> createSearchvehicle(Searchvehicle value) {
        return new JAXBElement<Searchvehicle>(_Searchvehicle_QNAME, Searchvehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchvehicleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "SearchvehicleResponse")
    public JAXBElement<SearchvehicleResponse> createSearchvehicleResponse(SearchvehicleResponse value) {
        return new JAXBElement<SearchvehicleResponse>(_SearchvehicleResponse_QNAME, SearchvehicleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Updateuser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "Updateuser")
    public JAXBElement<Updateuser> createUpdateuser(Updateuser value) {
        return new JAXBElement<Updateuser>(_Updateuser_QNAME, Updateuser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateuserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "UpdateuserResponse")
    public JAXBElement<UpdateuserResponse> createUpdateuserResponse(UpdateuserResponse value) {
        return new JAXBElement<UpdateuserResponse>(_UpdateuserResponse_QNAME, UpdateuserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Updatevehicle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "Updatevehicle")
    public JAXBElement<Updatevehicle> createUpdatevehicle(Updatevehicle value) {
        return new JAXBElement<Updatevehicle>(_Updatevehicle_QNAME, Updatevehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatevehicleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "UpdatevehicleResponse")
    public JAXBElement<UpdatevehicleResponse> createUpdatevehicleResponse(UpdatevehicleResponse value) {
        return new JAXBElement<UpdatevehicleResponse>(_UpdatevehicleResponse_QNAME, UpdatevehicleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sendmessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "sendmessage")
    public JAXBElement<Sendmessage> createSendmessage(Sendmessage value) {
        return new JAXBElement<Sendmessage>(_Sendmessage_QNAME, Sendmessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendmessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BusinessService/", name = "sendmessageResponse")
    public JAXBElement<SendmessageResponse> createSendmessageResponse(SendmessageResponse value) {
        return new JAXBElement<SendmessageResponse>(_SendmessageResponse_QNAME, SendmessageResponse.class, null, value);
    }

}
