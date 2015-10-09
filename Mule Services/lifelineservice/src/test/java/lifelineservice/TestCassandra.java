package lifelineservice;

import org.junit.Test;
import org.mule.api.MuleContext;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.tck.FunctionalTestCase;

public class TestCassandra extends FunctionalTestCase{
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCDB() throws Exception{
		
		MuleClient muleClient = muleContext.getClient();
		
		MuleMessage resMsg = muleClient.send("http://localhost:8013", new String(), null);
		
		System.out.println(resMsg.getPayloadForLogging());
		
	}

	@Override
	protected String getConfigResources() {
		
		return "src/main/app/testcassandra.xml";
	}

}
