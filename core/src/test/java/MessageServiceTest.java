import cc.logirl.core.MessageService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by xinxi on 2016/11/6.
 */
public class MessageServiceTest {

    private MessageService messageService;

    @Before
    public void setUp() {
        messageService = new MessageService();
    }

    @Test
    public void getMessage_ShouldReturnMessage() {
        Assert.assertEquals("Hello World!", messageService.getMessage());
    }
}
