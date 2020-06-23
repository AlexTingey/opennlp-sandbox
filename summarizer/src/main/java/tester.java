package main.java;


import main.java.lexicalchaining.LexicalChainingSummarizer;
import main.java.preprocess.DefaultDocProcessor;
import main.java.summarization.DocProcessor;
import main.java.textrank.TextRankSummarizer;

public class tester {
	static String sentModelLocation = "C:\\Users\\u0955294.AD\\Desktop\\ChatBot\\ChatBot\\BotBackend\\Dictionaries\\en-sent.bin";
	static DefaultDocProcessor dp;

	public static void main(String[] args) {
		String testSentence = "ow bad is the coronavirus economy? The worst ever, says Fed Chairman Jerome Powell.\r\n" + 
				"\r\n" + 
				"    \"We are going to see economic data for the second quarter that is worse than any data we have seen for the economy,\" Powell said. \"There are direct consequences of the disease and measures we are taking to protect ourselves from it.\"\r\n" + 
				"\r\n" + 
				"The recovery will be long and painful, but the economy could begin to bounce back significantly in the third quarter as businesses reopen, he added. While we won't go back to pre-coronavirus levels for quite some time, the third quarter could provide some economic relief.\r\n" + 
				"\r\n" + 
				"\"We will enter the new phase — and we are just beginning to maybe do that — where we will begin formal measures that require social distancing will be rolled back, gradually, and at different paces in different parts of the country. And in time, during this period, the economy will begin to recover,\" Powell said.\r\n" + 
				"\r\n" + 
				"Powell also noted that unemployment shot higher for minorities in the United States —much faster than it has for white Americans.\r\n" + 
				"\r\n" + 
				"Just a few months ago, the US labor market was the best-ever for minorities, Powell noted. Now, minorities are among the first to lose their jobs as stay-at-home orders have shuttered restaurants, movie theaters, retailers and many other businesses.\r\n" + 
				"\r\n" + 
				"\"It is heartbreaking, frankly, to see that all threatened now,\" Powell said. \"All the more need for our urgent response and also that of Congress, which has been urgent and large, and to do what we can to avoid longer run damage to the economy.\"\r\n" + 
				"\r\n" + 
				"Powell noted that people \"who are least able to bear it have been the first to lose their jobs, and they have little cushion to protect themselves.\r\n" + 
				"\r\n" + 
				"\"That is a very big concern,\" Powell said.";
		dp = new DefaultDocProcessor(sentModelLocation);

		LexicalChainingSummarizer lex;
		try {
			lex = new LexicalChainingSummarizer((DocProcessor)dp, "C:\\Users\\u0955294.AD\\Desktop\\ChatBot\\ChatBot\\BotBackend\\en-pos-maxent.bin");
			System.out.println(lex.summarize(testSentence,(DocProcessor)dp,5));
			TextRankSummarizer text = new TextRankSummarizer();
			System.out.println(text.summarize(testSentence, (DocProcessor)dp, 10));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
