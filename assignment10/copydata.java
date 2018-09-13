import java .io.*;
import java.io.IOException;
class copydata
{
	public static void main(String[] args) throws IOException 
	{
		BufferedWriter bw=new BufferedWriter(new FileWriter("f1.txt"));
		bw.write ("hello world");
		bw.close();
		InputStream in=new FileInputStream(new File("f1.txt"));
		OutputStream out=new FileOutputStream(new File("f2.txt"));
		byte[] buf=new byte[1024];
		int len;
		while((len=in.read(buf))>0)
		{
			out.write(buf,0,len);
		}
		in.close();
		out.close();
	}
}