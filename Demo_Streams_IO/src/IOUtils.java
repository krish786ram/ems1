import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUtils {

	public static void writePrimitives(OutputStream out) throws IOException{
		
		try(DataOutputStream dOut=new DataOutputStream(out)){
			dOut.writeLong(15L);
			dOut.writeDouble(1.8);
			dOut.writeBoolean(false);
		}
	}
	
	public static void readPrimitives(InputStream in) throws IOException{
		
		try(DataInputStream dIn=new DataInputStream(in)){
			long lValue=dIn.readLong();
			System.out.println(lValue+"\t");
			
			double dValue=dIn.readDouble();
			System.out.println(dValue+"\t");
			
			boolean flag=dIn.readBoolean();
			System.out.println(flag+"\t");
			
		}
		
	}
	
}
