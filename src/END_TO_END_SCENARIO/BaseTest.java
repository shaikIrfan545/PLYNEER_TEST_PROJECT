package END_TO_END_SCENARIO;

public class BaseTest implements IAutoconst
{
static
	{
	System.setProperty(CHROME_KEY, CHROME_VALUE);
	System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
}
