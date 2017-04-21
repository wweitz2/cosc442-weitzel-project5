package com.bond;

import static org.junit.Assert.*;

import org.junit.Test;

public class JamesBondTest {
	
	@Test
	public void testCase1(){
		assertFalse("(()");
	}

	@Test
	public void testCase2(){
		assertFalse("((()");
	}

	@Test
	public void testCase3(){
		assertFalse("((007()");
	}

	@Test
	public void testCase4(){
		assertFalse("((07()");
	}

	@Test
	public void testCase5(){
		assertFalse("((7()");
	}

	@Test
	public void testCase6(){
		assertFalse("()()");
	}

	@Test
	public void testCase7(){
		assertFalse("()007()");
	}

	@Test
	public void testCase8(){
		assertFalse("()07()");
	}

	@Test
	public void testCase9(){
		assertFalse("()7()");
	}

	@Test
	public void testCase10(){
		assertFalse("(0()");
	}

	@Test
	public void testCase11(){
		assertFalse("(0(()");
	}

	@Test
	public void testCase12(){
		assertFalse("(0(007()");
	}

	@Test
	public void testCase13(){
		assertFalse("(0(07()");
	}

	@Test
	public void testCase14(){
		assertFalse("(0(7()");
	}

	@Test
	public void testCase15(){
		assertFalse("(0)()");
	}

	@Test
	public void testCase16(){
		assertFalse("(0)007()");
	}

	@Test
	public void testCase17(){
		assertFalse("(0)07()");
	}

	@Test
	public void testCase18(){
		assertFalse("(0)7()");
	}

	@Test
	public void testCase19(){
		assertFalse("(00()");
	}

	@Test
	public void testCase20(){
		assertFalse("(00(()");
	}

	@Test
	public void testCase21(){
		assertFalse("(00(007()");
	}

	@Test
	public void testCase22(){
		assertFalse("(00(07()");
	}

	@Test
	public void testCase23(){
		assertFalse("(00(7()");
	}

	@Test
	public void testCase24(){
		assertFalse("(00)()");
	}

	@Test
	public void testCase25(){
		assertFalse("(00)007()");
	}

	@Test
	public void testCase26(){
		assertFalse("(00)07()");
	}

	@Test
	public void testCase27(){
		assertFalse("(00)7()");
	}

	@Test
	public void testCase28(){
		assertFalse("(000()");
	}

	@Test
	public void testCase29(){
		assertFalse("(000007()");
	}

	@Test
	public void testCase30(){
		assertFalse("(00007()");
	}

	@Test
	public void testCase31(){
		assertFalse("(0007()");
	}

	@Test
	public void testCase32(){
		assertFalse("(001()");
	}

	@Test
	public void testCase33(){
		assertFalse("(001007()");
	}

	@Test
	public void testCase34(){
		assertFalse("(00107()");
	}

	@Test
	public void testCase35(){
		assertFalse("(0017()");
	}

	@Test
	public void testCase36(){
		assertFalse("(002()");
	}

	@Test
	public void testCase37(){
		assertFalse("(002007()");
	}

	@Test
	public void testCase38(){
		assertFalse("(00207()");
	}

	@Test
	public void testCase39(){
		assertFalse("(0027()");
	}

	@Test
	public void testCase40(){
		assertFalse("(003()");
	}

	@Test
	public void testCase41(){
		assertFalse("(003007()");
	}

	@Test
	public void testCase42(){
		assertFalse("(00307()");
	}

	@Test
	public void testCase43(){
		assertFalse("(0037()");
	}

	@Test
	public void testCase44(){
		assertFalse("(004()");
	}

	@Test
	public void testCase45(){
		assertFalse("(004007()");
	}

	@Test
	public void testCase46(){
		assertFalse("(00407()");
	}

	@Test
	public void testCase47(){
		assertFalse("(0047()");
	}

	@Test
	public void testCase48(){
		assertFalse("(005()");
	}

	@Test
	public void testCase49(){
		assertFalse("(005007()");
	}

	@Test
	public void testCase50(){
		assertFalse("(00507()");
	}

	@Test
	public void testCase51(){
		assertFalse("(0057()");
	}

	@Test
	public void testCase52(){
		assertFalse("(006()");
	}

	@Test
	public void testCase53(){
		assertFalse("(006007()");
	}

	@Test
	public void testCase54(){
		assertFalse("(00607()");
	}

	@Test
	public void testCase55(){
		assertFalse("(0067()");
	}

	@Test
	public void testCase56(){
		assertFalse("(007()");
	}

	@Test
	public void testCase57(){
		assertFalse("(007)()");
	}

	@Test
	public void testCase58(){
		assertFalse("(007)(()");
	}

	@Test
	public void testCase59(){
		assertFalse("(007)(007()");
	}

	@Test
	public void testCase60(){
		assertFalse("(007)(07()");
	}

	@Test
	public void testCase61(){
		assertFalse("(007)(7()");
	}

	@Test
	public void testCase62(){
		assertFalse("(007))()");
	}

	@Test
	public void testCase63(){
		assertFalse("(007))007()");
	}

	@Test
	public void testCase64(){
		assertFalse("(007))07()");
	}

	@Test
	public void testCase65(){
		assertFalse("(007))7()");
	}

	@Test
	public void testCase66(){
		assertFalse("(007)0()");
	}

	@Test
	public void testCase67(){
		assertFalse("(007)0007()");
	}

	@Test
	public void testCase68(){
		assertFalse("(007)007()");
	}

	@Test
	public void testCase69(){
		assertFalse("(007)07()");
	}

	@Test
	public void testCase70(){
		assertFalse("(007)1()");
	}

	@Test
	public void testCase71(){
		assertFalse("(007)1007()");
	}

	@Test
	public void testCase72(){
		assertFalse("(007)107()");
	}

	@Test
	public void testCase73(){
		assertFalse("(007)17()");
	}

	@Test
	public void testCase74(){
		assertFalse("(007)2()");
	}

	@Test
	public void testCase75(){
		assertFalse("(007)2007()");
	}

	@Test
	public void testCase76(){
		assertFalse("(007)207()");
	}

	@Test
	public void testCase77(){
		assertFalse("(007)27()");
	}

	@Test
	public void testCase78(){
		assertFalse("(007)3()");
	}

	@Test
	public void testCase79(){
		assertFalse("(007)3007()");
	}

	@Test
	public void testCase80(){
		assertFalse("(007)307()");
	}

	@Test
	public void testCase81(){
		assertFalse("(007)37()");
	}

	@Test
	public void testCase82(){
		assertFalse("(007)4()");
	}

	@Test
	public void testCase83(){
		assertFalse("(007)4007()");
	}

	@Test
	public void testCase84(){
		assertFalse("(007)407()");
	}

	@Test
	public void testCase85(){
		assertFalse("(007)47()");
	}

	@Test
	public void testCase86(){
		assertFalse("(007)5()");
	}

	@Test
	public void testCase87(){
		assertFalse("(007)5007()");
	}

	@Test
	public void testCase88(){
		assertFalse("(007)507()");
	}

	@Test
	public void testCase89(){
		assertFalse("(007)57()");
	}

	@Test
	public void testCase90(){
		assertFalse("(007)6()");
	}

	@Test
	public void testCase91(){
		assertFalse("(007)6007()");
	}

	@Test
	public void testCase92(){
		assertFalse("(007)607()");
	}

	@Test
	public void testCase93(){
		assertFalse("(007)67()");
	}

	@Test
	public void testCase94(){
		assertFalse("(007)7()");
	}

	@Test
	public void testCase95(){
		assertFalse("(007)7007()");
	}

	@Test
	public void testCase96(){
		assertFalse("(007)707()");
	}

	@Test
	public void testCase97(){
		assertFalse("(007)77()");
	}

	@Test
	public void testCase98(){
		assertFalse("(007)8()");
	}

	@Test
	public void testCase99(){
		assertFalse("(007)8007()");
	}

	@Test
	public void testCase100(){
		assertFalse("(007)807()");
	}

	@Test
	public void testCase101(){
		assertFalse("(007)87()");
	}

	@Test
	public void testCase102(){
		assertFalse("(007)9()");
	}

	@Test
	public void testCase103(){
		assertFalse("(007)9007()");
	}

	@Test
	public void testCase104(){
		assertFalse("(007)907()");
	}

	@Test
	public void testCase105(){
		assertFalse("(007)97()");
	}

	@Test
	public void testCase106(){
		assertFalse("(007007()");
	}

	@Test
	public void testCase107(){
		assertFalse("(00707()");
	}

	@Test
	public void testCase108(){
		assertFalse("(0077()");
	}

	@Test
	public void testCase109(){
		assertFalse("(008()");
	}

	@Test
	public void testCase110(){
		assertFalse("(008007()");
	}

	@Test
	public void testCase111(){
		assertFalse("(00807()");
	}

	@Test
	public void testCase112(){
		assertFalse("(0087()");
	}

	@Test
	public void testCase113(){
		assertFalse("(009()");
	}

	@Test
	public void testCase114(){
		assertFalse("(009007()");
	}

	@Test
	public void testCase115(){
		assertFalse("(00907()");
	}

	@Test
	public void testCase116(){
		assertFalse("(0097()");
	}

	@Test
	public void testCase117(){
		assertFalse("(01()");
	}

	@Test
	public void testCase118(){
		assertFalse("(01007()");
	}

	@Test
	public void testCase119(){
		assertFalse("(0107()");
	}

	@Test
	public void testCase120(){
		assertFalse("(017()");
	}

	@Test
	public void testCase121(){
		assertFalse("(02()");
	}

	@Test
	public void testCase122(){
		assertFalse("(02007()");
	}

	@Test
	public void testCase123(){
		assertFalse("(0207()");
	}

	@Test
	public void testCase124(){
		assertFalse("(027()");
	}

	@Test
	public void testCase125(){
		assertFalse("(03()");
	}

	@Test
	public void testCase126(){
		assertFalse("(03007()");
	}

	@Test
	public void testCase127(){
		assertFalse("(0307()");
	}

	@Test
	public void testCase128(){
		assertFalse("(037()");
	}

	@Test
	public void testCase129(){
		assertFalse("(04()");
	}

	@Test
	public void testCase130(){
		assertFalse("(04007()");
	}

	@Test
	public void testCase131(){
		assertFalse("(0407()");
	}

	@Test
	public void testCase132(){
		assertFalse("(047()");
	}

	@Test
	public void testCase133(){
		assertFalse("(05()");
	}

	@Test
	public void testCase134(){
		assertFalse("(05007()");
	}

	@Test
	public void testCase135(){
		assertFalse("(0507()");
	}

	@Test
	public void testCase136(){
		assertFalse("(057()");
	}

	@Test
	public void testCase137(){
		assertFalse("(06()");
	}

	@Test
	public void testCase138(){
		assertFalse("(06007()");
	}

	@Test
	public void testCase139(){
		assertFalse("(0607()");
	}

	@Test
	public void testCase140(){
		assertFalse("(067()");
	}

	@Test
	public void testCase141(){
		assertFalse("(07()");
	}

	@Test
	public void testCase142(){
		assertFalse("(07007()");
	}

	@Test
	public void testCase143(){
		assertFalse("(0707()");
	}

	@Test
	public void testCase144(){
		assertFalse("(077()");
	}

	@Test
	public void testCase145(){
		assertFalse("(08()");
	}

	@Test
	public void testCase146(){
		assertFalse("(08007()");
	}

	@Test
	public void testCase147(){
		assertFalse("(0807()");
	}

	@Test
	public void testCase148(){
		assertFalse("(087()");
	}

	@Test
	public void testCase149(){
		assertFalse("(09()");
	}

	@Test
	public void testCase150(){
		assertFalse("(09007()");
	}

	@Test
	public void testCase151(){
		assertFalse("(0907()");
	}

	@Test
	public void testCase152(){
		assertFalse("(097()");
	}

	@Test
	public void testCase153(){
		assertFalse("(1()");
	}

	@Test
	public void testCase154(){
		assertFalse("(1007()");
	}

	@Test
	public void testCase155(){
		assertFalse("(107()");
	}

	@Test
	public void testCase156(){
		assertFalse("(17()");
	}

	@Test
	public void testCase157(){
		assertFalse("(2()");
	}

	@Test
	public void testCase158(){
		assertFalse("(2007()");
	}

	@Test
	public void testCase159(){
		assertFalse("(207()");
	}

	@Test
	public void testCase160(){
		assertFalse("(27()");
	}

	@Test
	public void testCase161(){
		assertFalse("(3()");
	}

	@Test
	public void testCase162(){
		assertFalse("(3007()");
	}

	@Test
	public void testCase163(){
		assertFalse("(307()");
	}

	@Test
	public void testCase164(){
		assertFalse("(37()");
	}

	@Test
	public void testCase165(){
		assertFalse("(4()");
	}

	@Test
	public void testCase166(){
		assertFalse("(4007()");
	}

	@Test
	public void testCase167(){
		assertFalse("(407()");
	}

	@Test
	public void testCase168(){
		assertFalse("(47()");
	}

	@Test
	public void testCase169(){
		assertFalse("(5()");
	}

	@Test
	public void testCase170(){
		assertFalse("(5007()");
	}

	@Test
	public void testCase171(){
		assertFalse("(507()");
	}

	@Test
	public void testCase172(){
		assertFalse("(57()");
	}

	@Test
	public void testCase173(){
		assertFalse("(6()");
	}

	@Test
	public void testCase174(){
		assertFalse("(6007()");
	}

	@Test
	public void testCase175(){
		assertFalse("(607()");
	}

	@Test
	public void testCase176(){
		assertFalse("(67()");
	}

	@Test
	public void testCase177(){
		assertFalse("(7()");
	}

	@Test
	public void testCase178(){
		assertFalse("(7007()");
	}

	@Test
	public void testCase179(){
		assertFalse("(707()");
	}

	@Test
	public void testCase180(){
		assertFalse("(77()");
	}

	@Test
	public void testCase181(){
		assertFalse("(8()");
	}

	@Test
	public void testCase182(){
		assertFalse("(8007()");
	}

	@Test
	public void testCase183(){
		assertFalse("(807()");
	}

	@Test
	public void testCase184(){
		assertFalse("(87()");
	}

	@Test
	public void testCase185(){
		assertFalse("(9()");
	}

	@Test
	public void testCase186(){
		assertFalse("(9007()");
	}

	@Test
	public void testCase187(){
		assertFalse("(907()");
	}

	@Test
	public void testCase188(){
		assertFalse("(97()");
	}

	@Test
	public void testCase189(){
		assertFalse(")()");
	}

	@Test
	public void testCase190(){
		assertFalse(")007()");
	}

	@Test
	public void testCase191(){
		assertFalse(")07()");
	}

	@Test
	public void testCase192(){
		assertFalse(")7()");
	}

	@Test
	public void testCase193(){
		assertFalse("0()");
	}

	@Test
	public void testCase194(){
		assertFalse("0007()");
	}

	@Test
	public void testCase195(){
		assertFalse("007()");
	}

	@Test
	public void testCase196(){
		assertFalse("07()");
	}

	@Test
	public void testCase197(){
		assertFalse("1()");
	}

	@Test
	public void testCase198(){
		assertFalse("1007()");
	}

	@Test
	public void testCase199(){
		assertFalse("107()");
	}

	@Test
	public void testCase200(){
		assertFalse("17()");
	}

	@Test
	public void testCase201(){
		assertFalse("2()");
	}

	@Test
	public void testCase202(){
		assertFalse("2007()");
	}

	@Test
	public void testCase203(){
		assertFalse("207()");
	}

	@Test
	public void testCase204(){
		assertFalse("27()");
	}

	@Test
	public void testCase205(){
		assertFalse("3()");
	}

	@Test
	public void testCase206(){
		assertFalse("3007()");
	}

	@Test
	public void testCase207(){
		assertFalse("307()");
	}

	@Test
	public void testCase208(){
		assertFalse("37()");
	}

	@Test
	public void testCase209(){
		assertFalse("4()");
	}

	@Test
	public void testCase210(){
		assertFalse("4007()");
	}

	@Test
	public void testCase211(){
		assertFalse("407()");
	}

	@Test
	public void testCase212(){
		assertFalse("47()");
	}

	@Test
	public void testCase213(){
		assertFalse("5()");
	}

	@Test
	public void testCase214(){
		assertFalse("5007()");
	}

	@Test
	public void testCase215(){
		assertFalse("507()");
	}

	@Test
	public void testCase216(){
		assertFalse("57()");
	}

	@Test
	public void testCase217(){
		assertFalse("6()");
	}

	@Test
	public void testCase218(){
		assertFalse("6007()");
	}

	@Test
	public void testCase219(){
		assertFalse("607()");
	}

	@Test
	public void testCase220(){
		assertFalse("67()");
	}

	@Test
	public void testCase221(){
		assertFalse("7()");
	}

	@Test
	public void testCase222(){
		assertFalse("7007()");
	}

	@Test
	public void testCase223(){
		assertFalse("707()");
	}

	@Test
	public void testCase224(){
		assertFalse("77()");
	}

	@Test
	public void testCase225(){
		assertFalse("8()");
	}

	@Test
	public void testCase226(){
		assertFalse("8007()");
	}

	@Test
	public void testCase227(){
		assertFalse("807()");
	}

	@Test
	public void testCase228(){
		assertFalse("87()");
	}

	@Test
	public void testCase229(){
		assertFalse("9()");
	}

	@Test
	public void testCase230(){
		assertFalse("9007()");
	}

	@Test
	public void testCase231(){
		assertFalse("907()");
	}
	
}
