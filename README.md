# 基于SpringBoot2.1.0.RELEASE的简单计算器实现
## 使用方式

### 1 依赖引入
```xml
<dependency>
	<groupId>com.edgewalk</groupId>
	<artifactId>calculator-spring-boot-starter</artifactId>
	<version>1.0.0</version>
</dependency>
```
### 2 编码使用
```java
import com.edgewalk.calculator.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.script.ScriptException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileuploadApplicationTests {

	@Autowired
	private Calculator calculator;

	@Test
	public void starterTest() throws ScriptException {
		Object cal = calculator.cal("3*10");
		System.out.println(cal);
	}
}
```