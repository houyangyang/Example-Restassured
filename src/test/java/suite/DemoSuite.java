package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import JunitDemo.Test1;
import JunitDemo.Test2;
import JunitDemo.Test3;
import JunitDemo.Test4;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Test1.class,
	Test2.class,
	Test3.class,
	Test4.class
	
})
public class DemoSuite {
	
}
