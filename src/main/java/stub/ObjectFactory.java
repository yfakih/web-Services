
package stub;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stub package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ConvertToMAD_QNAME = new QName("http://server/", "convertToMAD");
    private static final QName _ConvertToMADResponse_QNAME = new QName("http://server/", "convertToMADResponse");
    private static final QName _ListAccounts_QNAME = new QName("http://server/", "listAccounts");
    private static final QName _ListAccountsResponse_QNAME = new QName("http://server/", "listAccountsResponse");
    private static final QName _NewAccount_QNAME = new QName("http://server/", "newAccount");
    private static final QName _NewAccountResponse_QNAME = new QName("http://server/", "newAccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertToMAD }
     * 
     * @return
     *     the new instance of {@link ConvertToMAD }
     */
    public ConvertToMAD createConvertToMAD() {
        return new ConvertToMAD();
    }

    /**
     * Create an instance of {@link ConvertToMADResponse }
     * 
     * @return
     *     the new instance of {@link ConvertToMADResponse }
     */
    public ConvertToMADResponse createConvertToMADResponse() {
        return new ConvertToMADResponse();
    }

    /**
     * Create an instance of {@link ListAccounts }
     * 
     * @return
     *     the new instance of {@link ListAccounts }
     */
    public ListAccounts createListAccounts() {
        return new ListAccounts();
    }

    /**
     * Create an instance of {@link ListAccountsResponse }
     * 
     * @return
     *     the new instance of {@link ListAccountsResponse }
     */
    public ListAccountsResponse createListAccountsResponse() {
        return new ListAccountsResponse();
    }

    /**
     * Create an instance of {@link NewAccount }
     * 
     * @return
     *     the new instance of {@link NewAccount }
     */
    public NewAccount createNewAccount() {
        return new NewAccount();
    }

    /**
     * Create an instance of {@link NewAccountResponse }
     * 
     * @return
     *     the new instance of {@link NewAccountResponse }
     */
    public NewAccountResponse createNewAccountResponse() {
        return new NewAccountResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertToMAD }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertToMAD }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "convertToMAD")
    public JAXBElement<ConvertToMAD> createConvertToMAD(ConvertToMAD value) {
        return new JAXBElement<>(_ConvertToMAD_QNAME, ConvertToMAD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertToMADResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertToMADResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "convertToMADResponse")
    public JAXBElement<ConvertToMADResponse> createConvertToMADResponse(ConvertToMADResponse value) {
        return new JAXBElement<>(_ConvertToMADResponse_QNAME, ConvertToMADResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccounts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListAccounts }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "listAccounts")
    public JAXBElement<ListAccounts> createListAccounts(ListAccounts value) {
        return new JAXBElement<>(_ListAccounts_QNAME, ListAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccountsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListAccountsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "listAccountsResponse")
    public JAXBElement<ListAccountsResponse> createListAccountsResponse(ListAccountsResponse value) {
        return new JAXBElement<>(_ListAccountsResponse_QNAME, ListAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NewAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "newAccount")
    public JAXBElement<NewAccount> createNewAccount(NewAccount value) {
        return new JAXBElement<>(_NewAccount_QNAME, NewAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NewAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "newAccountResponse")
    public JAXBElement<NewAccountResponse> createNewAccountResponse(NewAccountResponse value) {
        return new JAXBElement<>(_NewAccountResponse_QNAME, NewAccountResponse.class, null, value);
    }

}
