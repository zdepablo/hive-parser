
import org.apache.hadoop.hive.ql.parse.ASTNode;
import org.apache.hadoop.hive.ql.parse.ParseDriver;
import org.apache.hadoop.hive.ql.parse.ParseException;


public class Test {

	
	public static void main(String[] args) throws ParseException {
		
		String query = "SELECT cod_paisoalf as aaa, cod_entalfa as bbb, count(*) as ccc "
				+ "FROM (select cod_paisoalf, cod_entalfa from  da_relaciones.graph_adeudos_d where kk = '3' ) a  "
				+ "JOIN (select cod_paisoalf_b, cod_entalfa_b from  da_relaciones.graph_adeudos_d) b";
		
		ParseDriver pd = new ParseDriver();
		ASTNode tree = pd.parse(query);
		
		System.out.println(tree.dump());
			
	
	}
	
}
