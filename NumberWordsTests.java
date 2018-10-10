package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( 1000 ) ) ;
	}
	@Test
	public void numberElevenToNineteenSuccess() {
		Assert.assertEquals( "Success", "Eleven", numberWords.toWords( 11 ) ) ;
		Assert.assertEquals( "Success", "Twelve", numberWords.toWords( 12 ) ) ;
		Assert.assertEquals( "Success", "Thirteen", numberWords.toWords( 13 ) ) ;
		Assert.assertEquals( "Success", "Fourteen", numberWords.toWords( 14 ) ) ;
		Assert.assertEquals( "Success", "Fifteen", numberWords.toWords( 15 ) ) ;
		Assert.assertEquals( "Success", "Sixteen", numberWords.toWords( 16 ) ) ;
		Assert.assertEquals( "Success", "Seventeen", numberWords.toWords( 17 ) ) ;
		Assert.assertEquals( "Success", "Eighteen", numberWords.toWords( 18 ) ) ;
		Assert.assertEquals( "Success", "Nineteen", numberWords.toWords( 19 ) ) ;
	}

}
