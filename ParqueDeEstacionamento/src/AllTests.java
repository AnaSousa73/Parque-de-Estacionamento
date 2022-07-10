import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DevolverLugarTest.class, EstacionamentoDeficienteTest.class,
		EstacionamentoEletricoTest.class, EstacionamentoEletricoTest2.class, EstacionamentoHidrogenioTest.class,
		EstacionamentoSimplesTest.class, EstacionarTest.class, FechoDiarioTest.class })
public class AllTests {

}
