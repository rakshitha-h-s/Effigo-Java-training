package encoding_decoding;
import java.util.Arrays;
import java.util.Base64;

public class EncodingDecoding {
	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getEncoder();
		byte[] bytearr = { 1, 2, 3, 4 };
		byte[] bytearr2 = encoder.encode(bytearr);
		System.out.println("Encoded byte array is " + Arrays.toString(bytearr2));
		byte[] bytearr3 = new byte[10];
		int x = encoder.encode(bytearr, bytearr3);
		System.out.println("encoded to new array " + Arrays.toString(bytearr3));
		System.out.println("numer of bytes " + x);
		/*
		 * Encoding string
		 */
		String str=encoder.encodeToString("java program".getBytes());
		System.out.println("encoded string "+str);
		/*
		 * decoding string
		 */
		Base64.Decoder decoder=Base64.getDecoder();
		String str2=new String(decoder.decode(str));
		System.out.println("decoded string "+str2);
		
;	}
}
