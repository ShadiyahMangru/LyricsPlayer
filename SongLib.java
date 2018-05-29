/* SongLib class holds current contents of Song Library (incl. lyrics)*/

package LyricsPlayer;
import java.util.*;

public class SongLib{
	private ArrayList<Song> songLib = new ArrayList<Song>();
	private ArrayList<String> formatSongLib;
	private ArrayList<String> unsortedFormatSongLib;
	private String[] songsMenu;
	private int songCount;
	
	public SongLib(){
		setSongLib();
		songCount = songLib.size();
	}
	
	public ArrayList<Song> getSongLib(){
		return songLib;	
	}
	
	public ArrayList<String> getUnsortedFormatSongLib(){
		return unsortedFormatSongLib;	
	}
	
	public String[] getSongsMenu(){
		return songsMenu;	
	}
	
	public String getSongsMenu(int index){
		return songsMenu[index];	
	}
	
	public int getSongCount(){
		return songCount;	
	}
	
	public void setSongLib(){
		songLib.add(new Song("Might", "Modest Mouse", 0, 1, 31, MightLyrics));
		songLib.add(new Song("Carried Away", "Passion Pit", 0, 3, 42, CAwayLyrics));
		songLib.add(new Song("November Rain", "Guns 'N Roses", 0, 8, 57, NRainLyrics));
		songLib.add(new Song("Thru the Eyes of Ruby", "The Smashing Pumpkins", 0, 7, 38, TTEORubyLyrics));
		songLib.add(new Song("Corduroy", "Pearl Jam", 0, 4, 37, CorduroyLyrics));
		songLib.add(new Song("Everything Counts", "Depeche Mode", 0, 4, 21, ECountsLyrics));
		songLib.add(new Song("I Will Wait", "Mumford & Sons", 0, 4, 36, IWWaitLyrics));
		songLib.add(new Song("Hello", "Martin Solveig & Dragonette", 0, 4, 41, HelloLyrics));
		songLib.add(new Song("My Name is Jonas", "Weezer", 0, 3, 23, MNIJonasLyrics));
		songLib.add(new Song("Love Will Tear Us Apart", "Joy Division", 0, 3, 17, LWTUApartLyrics));
		songLib.add(new Song("Drain You", "Nirvana", 0, 3, 43, DYouLyrics));
		songLib.add(new Song("Rock 'n' Roll High School", "Ramones", 0, 2, 38, RNRHSchoolLyrics));
		songLib.add(new Song("Just Like Heaven", "The Cure", 0, 3, 32, JLHeavenLyrics));
		songLib.add(new Song("The Flame", "Cheap Trick", 0, 5, 37, TFlameLyrics));
		songLib.add(new Song("You Said Something", "PJ Harvey", 0, 3, 19, YSSomethingLyrics));
		songLib.add(new Song("Deeper Into Movies", "Yo La Tengo", 0, 5, 23, DIMoviesLyrics));
		songLib.add(new Song("Just What I Needed", "The Cars", 0, 3, 44, JWINeededLyrics));
		songLib.add(new Song("Kiss Off", "Violent Femmes", 0, 2, 56, KOffLyrics));
		songLib.add(new Song("We Are Young", "Fun", 0, 4, 10, WAYoungLyrics));
		songLib.add(new Song("Bizarre Love Triangle", "New Order", 0, 4, 22, BLTriangleLyrics));
		songLib.add(new Song("Pompeii", "Bastille", 0, 3, 34, PompeiiLyrics));
		formatSongLib = new ArrayList<String>(songLib.size());
		unsortedFormatSongLib = new ArrayList<String>(songLib.size());
		for(int i = 0; i < songLib.size(); i++){
			formatSongLib.add(songLib.get(i).formatInfo());	
			unsortedFormatSongLib.add(songLib.get(i).formatInfo());
		}
		Collections.sort(formatSongLib);
		songsMenu = new String [songLib.size()];
		formatSongLib.toArray(songsMenu);
	}
	
	String MightLyrics = " I might/"+
		" And you might/"+
		" But neither of us do, though/"+
		" And neither of us will/"+
		" I broke every bone in my goddamn jaw/"+
		" That's a lot it is the last one I ever got(?)/"+
		" I might/"+
		" And you might/"+
		" But neither of us do, though/"+
		" And neither of us will/"+
		" Yesterday night I broke every bone in my jaw/"+
		" Thought so hard it's the last thing I ever thought";
	
	String CAwayLyrics = " Since my heart is golden/"+
		" I've got sense to hold in/"+
		" Tempted just to make an ugly scene/"+
		" No I'm not as proper/"+
		" My money's in copper/"+
		" Ripped down from the brownstones to the street/"+
		" Listen, I'm your friend, don't quote me/"+
		" But not a friend worth noting/"+
		" Yes, please don't ever note me as your friend/"+
		" Who says we have cold hearts?/"+
		" Acting out our old parts/"+
		" Let's perform our favorite little scene, oh oh oh oh/"+
		" I get carried away, carried away from you/"+
		" When I'm open and afraid/"+
		" 'Cause I'm sorry, sorry 'bout that/"+
		" Sorry 'bout things that I've said/"+
		" Always let it get in my way/"+
		" All your appeal, once again with feeling/"+
		" Higher education making sense/"+
		" Justify your thesis, certain that you need this/"+
		" Tell me what your point is in defense/"+
		" Listen, I don't really know you/"+
		" And I don't think I want to/"+
		" But I think I can fake it if you can/"+
		" Let's agree there's no need, no more talk of money/"+
		" Let's just keep pretending to be friends, oh oh oh/"+
		" I get carried away, carried away, from you/"+
		" When I'm open and afraid/"+
		" 'Cause I'm sorry, sorry 'bout that/"+
		" Sorry 'bout things that I've said/"+
		" Always let it get in my way/"+
		" I get carried away, carried away from you/"+
		" When I'm open and afraid/"+
		" 'Cause I'm sorry, sorry 'bout that/"+
		" Sorry 'bout things that I've said/"+
		" Always let it get in my way/"+
		" Wake up in the morning, wake up in the evening/"+
		" Wake up when you want to/"+
		" 'Cause no one's really watching/"+
		" Wish you had something to say about it/"+
		" But we all have problems/"+
		" We're all having problems/"+
		" And we all got something to say/"+
		" I get carried away, carried away from you/"+
		" When I'm open and afraid/"+
		" 'Cause I'm sorry, sorry 'bout that/"+
		" Sorry 'bout things that I've said/"+
		" Always let it get in my way/"+
		" I get carried away, carried away from you/"+
		" When I'm open and afraid/"+
		" 'Cause I'm sorry, sorry 'bout that/"+
		" Sorry 'bout things that I've said/"+
		" Always let it get in my way";
		
	String NRainLyrics = " When I look into your eyes/"+
		" I can see a love restrained/"+
		" But darlin' when I hold you/"+
		" Don't you know I feel the same/"+
		" Nothin' lasts forever/"+
		" And we both know hearts can change/"+
		" And it's hard to hold a candle/"+
		" In the cold November rain/"+
		" We've been through this such a long, long time/"+
		" Just tryin' to kill the pain, oo yeah/"+
		" But love is always coming and love is always going/"+
		" And no one's really sure who's lettin' go today/"+
		" Walking away/"+
		" If we could take the time/"+
		" To lay it on the line/"+
		" I could rest my head/"+
		" Just knowin' that you were mine/"+
		" All mine/"+
		" So if you want to love me/"+
		" Then darlin' don't refrain/"+
		" Or I'll just end up walkin'/"+
		" In the cold November rain/"+
		" Do you need some time on your own/"+
		" Do you need some time all alone/"+
		" Everybody needs some time/"+
		" On their own/"+
		" Don't you know you need some time all alone/"+
		" I know it is hard to keep an open heart/"+
		" When even friends seem out to harm you/"+
		" But if you could heal a broken heart/"+
		" Wouldn't time be out to charm you/"+
		" Sometimes I need some time on my own/"+
		" Sometimes I need some time all alone/"+
		" Everybody needs some time on their own/"+
		" Don't you know you need some time all alone/"+
		" And when your fears subside/"+
		" And shadows still remain, oh yeah/"+
		" I know that you can love me/"+
		" When there's no one left to blame/"+
		" So never mind the darkness/"+
		" We still can find a way/"+
		" 'Cause nothin' lasts forever/"+
		" Even cold November rain/"+
		" Don't ya think that you need somebody/"+
		" Don't ya think that you need someone/"+
		" Everybody needs somebody/"+
		" You're not the only one/"+
		" You're not the only one/"+
		" Don't ya think that you need somebody/"+
		" Don't ya think that you need someone/"+
		" Everybody needs somebody/"+
		" You're not the only one/"+
		" You're not the only one/"+
		" Don't ya think that you need somebody/"+
		" Don't ya think that you need someone/"+
		" Everybody needs somebody/"+
		" You're not the only one/"+
		" You're not the only one/"+
		" Don't ya think that you need somebody/"+
		" Don't ya think that you need someone/"+
		" Everybody needs somebody";
		
	String TTEORubyLyrics = " Wrap me up in always/"+
		" And drag me in with maybes, yeah/"+
		" Your innocence is treasure, your innocence is death/"+
		" Your innocence is all I have/"+
		" Breathing underwater/"+
		" And living under glass/"+
		" And if you spin your love around/"+
		" The secrets of your dreams/"+
		" You may find your love is gone/"+
		" And is not quite what it seemed/"+
		" To appear to disappear/"+
		" Beneath all your darkest fears/"+
		" I believe in never/"+
		" I believe in all the way/"+
		" But belief is not to notice, belief is just some faith/"+
		" And faith can't help you to escape/"+
		" And with this ring I wed thee true/"+
		" And with this ring I wed thee now/"+
		" And with this ring I play so dead/"+
		" But no one's asking for the truth, so let me tell you/"+
		" If you spin your love around/"+
		" The secrets of your dreams/"+
		" You may find your love is gone/"+
		" And is not quite what it seemed/"+
		" To appear to disappear/"+
		" Beneath all your darkest fears/"+
		" To the revelations of fresh faced youth/"+
		" No one will come to save you/"+
		" So speak your peace in the murmurs drawn/"+
		" But youth is wasted on the young/"+
		" Your strength is my weakness, your weakness my hate/"+
		" My love for you just can't explain/"+
		" Why we're forever frozen, forever beautiful/"+
		" Forever lost inside ourselves/"+
		" The night has come to hold us young/"+
		" The night has come to hold us young/"+
		" The night has come to hold us young/"+
		" The night has come to hold us young/"+
		" The night has come to hold us young/"+
		" The night has come to hold us young";  
		
	String CorduroyLyrics = " The waiting drove me mad/"+
		" You're finally here and I'm a mess/"+
		" I take your entrance back/"+
		" Can't let you roam inside my head/"+
		" I don't want to take what you can give/"+
		" I would rather starve than eat your bread/"+
		" I would rather run but I can't walk/"+
		" Guess I'll lay alone just like before/"+
		"I take the poor man's path I must refuse your test/"+
		" Push me and I will resist/"+
		" This behaviours not unique/"+
		" I don't want to hear from those who know/"+
		" They can buy but can't put on my clothes/"+
		" I don't want to limp for them to walk/"+
		" Never would have known of me before/"+
		" I don't want to be held in your debt/"+
		" I'll pay it of in blood let, I be wed/"+
		" I'm already cut up an half dead/"+
		" I'll end up alone like I began/"+
		" Everything has chains absolutely nothings changed/"+
		" Take my hand not my picture spill my tincture/"+
		" I don't want to take what you can give/"+
		" I would rather starve than eat your breast/"+
		" All the things that others want for me/"+
		" Can't buy what I want because its free/"+
		" Can't buy what I want because its free/"+
		" Can't be what you want because I'm/"+
		" I ain't supposed to be just fun/"+
		" Oh to live and die let it be done/"+
		" I figure I'll be dammed/"+
		" All alone like I began";  
		
	String ECountsLyrics = " The handshake seals the contract from the contract/"+ 
		" There's no turning back/"+
		" The turning point of a career in Korea, being insincere/"+
		" The holiday was fun packed/"+
		" The contract still intact/"+
		" The grabbing hands/"+
		" Grab all they can/"+
		" All for themselves after all/"+
		" The grabbing hands/"+
		" Grab all they can/"+
		" All for themselves after all/"+
		" It's a competitive world/"+
		" Everything counts in large amounts/"+
		" The graph on the wall/"+
		" Tells the story of it all/"+
		" Picture it now/"+
		" See just how the lies and deceit/"+
		" Gained a little more power/"+
		" Confidence taken in by a sun tan and a grin/"+
		" The grabbing hands/"+
		" Grab all they can/"+
		" All for themselves after all/"+
		" The grabbing hands/"+
		" Grab all they can/"+
		" All for themselves after all/"+
		" It's a competitive world/"+
		" Everything counts in large amounts/"+
		" Everything counts in large amounts/"+
		" The grabbing hands/"+
		" Grab all they can/"+
		" Everything counts in large amounts/"+
		" The grabbing hands/"+
		" Grab all they can/"+
		" Everything counts in large amounts/"+
		" Everything, everything/"+
		" Everything, everything/"+
		" The grabbing hands/"+
		" Grab all they can/"+
		" Everything counts in large amounts/"+
		" The grabbing hands/"+
		" Grab all they can/"+
		" Everything counts in large amounts";  
		
	String IWWaitLyrics = " Well I came home/"+
		" Like a stone/"+
		" And I fell heavy into your arms/"+
		" These days of dust/"+
		" Which we've known/"+
		" Will blow away with this new sun/"+
		" But I'll kneel down/"+
		" Wait for now/"+
		" And I'll kneel down/"+
		" Know my ground/"+
		" And I will wait, I will wait for you/"+
		" And I will wait, I will wait for you/"+
		" So break my step/"+
		" And relent/"+
		" You forgave and I won't forget/"+
		" Know what we've seen/"+
		" And him with less/"+
		" Now in some way/"+
		" Shake the excess/"+
		" 'Cause I will wait, I will wait for you/"+
		" And I will wait, I will wait for you/"+
		" And I will wait, I will wait for you/"+
		" And I will wait, I will wait for you/"+
		" Now I'll be bold/"+
		" As well as strong/"+
		" And use my head alongside my heart/"+
		" So take my flesh/"+
		" And fix my eyes/"+
		" A tethered mind free from the lies/"+
		" And I'll kneel down/"+
		" Wait for now/"+
		" I'll kneel down/"+
		" Know my ground/"+
		" Raise my hands/"+
		" Paint my spirit gold/"+
		" And bow my head/"+
		" Keep my heart slow/"+
		" 'Cause I will wait, I will wait for you/"+
		" And I will wait, I will wait for you/"+
		" And I will wait, I will wait for you/"+
		" And I will wait, I will wait for you";  
		
	String HelloLyrics = " I could stick around and get along with you, hello./"+
		" It doesn't really mean that I'm into you, hello./"+
		" You're alright but I'm here, darling, to enjoy the party./"+
		" Don't get too excited 'cause that's all you get from me, hey./"+
		" Yeah I think you're cute, but really you should know./"+
		" I just came to say hello, hello, hello, hello./"+
		" I'm not the kinda girl to get messed up with you, hello./"+
		" I'ma let you try to convince me to, hello./"+
		" It's alright I'm getting dizzy just enjoy the party./"+
		" It's OK with me if you don't have that much to say, hey./"+
		" Kinda like this game but there's something you should know./"+
		" I just came to say hello, hello, hey, hey./"+
		" I could stick around and get along with you, hello./"+
		" It doesn't really mean that I'm into you, hello./"+
		" You're alright but I'm here, darling, to enjoy the party./"+
		" I'm getting dizzy, just enjoy the party./"+
		" I just came to say hello, hello, hello, hello./"+
		" I'm not the kinda girl to get messed up with you, hello./"+
		" I'ma let you try to convince me to, hello./"+
		" It's alright, I'm getting dizzy, just enjoy the party./"+
		" It's OK with me if you don't have that much to say, hey./"+
		" Kinda like this game but there's something you should know./"+
		" I just came to say hello, hey.";  
		
	String MNIJonasLyrics = " My name is Jonas/"+
		" I'm carrying the wheel/"+
		" Thanks for all you've shown us/"+
		" But this is how we feel/"+
		" Come sit next to me/"+
		" Pour yourself some tea/"+
		" Just like Grandma made/"+
		" When we couldn't find sleep/"+
		" Things were better then/"+
		" Once but never again/"+
		" We've all left the den/"+
		" Let me tell you about it/"+
		" The choo-choo train left right on time/"+
		" A ticket costs only your mind/"+
		" The driver said, 'Hey man, we go all the way'/"+
		" Of course we were willing to pay/"+
		" My name is Wepeel/"+
		" I got a box full of your toys/"+
		" They're fresh out of batteries/"+
		" But they're still making noise, making noise/"+
		" Tell me what to do/"+
		" Now the tank is dry/"+
		" Now this wheel is flat/"+
		" And you know what else/"+
		" Guess what I received/"+
		" In the mail today/"+
		" Words of deep concern/"+
		" From my little brother/"+
		" The building's not going as he planned/"+
		" The foreman has injured his hand/"+
		" The dozer will not clear a path/"+
		" The driver swears he learned his math/"+
		" The workers are going home/"+
		" The workers are going home/"+
		" The workers are going home/"+
		" The workers are going home/"+
		" Yeah/"+
		" The workers are going home/"+
		" The workers are going home/"+
		" The workers are going home/"+
		" Yeah, yeah, yeah";
		
	String LWTUApartLyrics = " When the routine bites hard/"+
		" And ambitions are low/"+
		" And the resentment rides high/"+
		" But emotions wont grow/"+
		" And were changing our ways,/"+
		" Taking different roads/"+
		" Then love, love will tear us apart again/"+
		" Why is the bedroom so cold/"+
		" Turned away on your side?/"+
		" Is my timing that flawed,/"+
		" Our respect run so dry?/"+
		" Yet theres still this appeal/"+
		" That weve kept through our lives/"+
		" Love, love will tear us apart again/"+
		" Do you cry out in your sleep/"+
		" All my failings expose?/"+
		" Get a taste in my mouth/"+
		" As desperation takes hold/"+
		" Is it something so good/"+
		" Just cant function no more?/"+
		" When love, love will tear us apart again";
		
	String DYouLyrics = " One baby to another says, 'I'm lucky to have met you'/"+
		" I don't care what you think unless it is about me/"+
		" It is now my duty to completely drain you/"+
		" I travel through a tube and end up in your infection/"+
		" Chew my meat for you/"+
		" Pass it back and forth in a passionate kiss/"+
		" From my mouth to yours/"+
		" I like you/"+
		" With eyes so dilated, I've became your pupil/"+
		" You've taught me everything without a poison apple/"+
		" The water is so yellow/"+
		" I'm a healthy student/"+
		" Indebted and so grateful/"+
		" Vacuum out the fluids/"+
		" Chew my meat for you/"+
		" Pass it back and forth in a passionate kiss/"+
		" From my mouth to yours/"+
		" I like you, you, you, you, you, you/"+
		" One baby to another says, 'I'm lucky to have met you'/"+
		" I don't care what you think unless it is about me/"+
		" It is now my duty to completely drain you/"+
		" A travel through a tube and end up in your infection/"+
		" Chew my meat for you/"+
		" Pass it back and forth in a passionate kiss/"+
		" From my mouth to yours/"+
		" Sloppy lips to lips/"+
		" You're my vitamins/"+
		" I like you";
		
	String RNRHSchoolLyrics = " Rock, rock, rock, rock n' roll high school/"+
		" Well I don't care about history/"+
		" Rock, rock, rock 'n' roll high school/"+
		" Cause that's not where I want to be/"+
		" Rock, rock, rock 'n' roll high school/"+
		" I just want to have some kicks/"+
		" I just want to get some chicks/"+
		" Rock, rock, rock, rock, rock 'n' roll high school/"+
		" Well the girls out there knock me out, you know/"+
		" Rock, rock, rock 'n' roll high school/"+
		" Cruisin' around in my GTO/"+
		" Rock, rock, rock 'n' roll high school/"+
		" I hate the teachers and the principal/"+
		" Don't want to be taught to be no fool/"+
		" Rock, rock, rock, rock, rock 'n' roll high school/"+
		" Rock, rock, rock, rock, rock 'n' roll high school/"+
		" Fun, fun, rock 'n' roll high school/"+
		" Fun, fun, rock 'n' roll high school/"+
		" Fun, fun, rock 'n' roll high school/"+
		" Fun, fun, oh baby/"+
		" Fun, fun, oh baby/"+
		" Fun, fun, fun ,fun/"+
		" Rock, rock, rock, rock, rock 'n' roll high school/"+
		" Rock, rock, rock, rock, rock 'n' roll high school/"+
		" Well I don't care about history/"+
		" Rock, rock, rock 'n' roll high school/"+
		" Cause that's not where I want to be/"+
		" Rock, rock, rock 'n' roll high school/"+
		" I just want to have some kicks/"+
		" I just want to get some chicks/"+
		" Rock, rock, rock, rock, rock 'n' roll high school/"+
		" Fun, fun, rock 'n' roll high school/"+
		" Fun, fun, rock 'n' roll high school/"+
		" Fun, fun, rock 'n' roll high school/"+
		" Fun, fun, oh baby/"+
		" Fun, fun, oh baby/"+
		" Fun, fun, fun, fun";
		
	String JLHeavenLyrics = " Show me, show me, show me how you do that trick/"+
		" The one that makes me scream she said/"+
		" The one that makes me laugh she said/"+
		" Threw her arms around my neck/"+
		" Show me how you do it and I'll promise you/"+
		" I'll promise that I'll run away with you, I'll run away with you/"+
		" Spinning on that dizzy edge/"+
		" Kissed her face and kissed her head/"+
		" Dreamed of all the different ways, I had to make her glow/"+
		" Why are you so far away she said/"+
		" Why won't you ever know that I'm in love with you?/"+
		" That I'm in love with you?/"+
		" You, soft and only, you lost and lonely/"+
		" You, strange as angels/"+
		" Dancing in the deepest oceans/"+
		" Twisting in the water/"+
		" You're just like a dream/"+
		" You're just like a dream/"+
		" Daylight licked me into shape/"+
		" I must have been asleep for days/"+
		" And moving lips to breathe her name/"+
		" I opened up my eyes/"+
		" And found myself alone, alone, alone above a raging sea/"+
		" That stole the only girl I loved and drowned her deep inside of me/"+
		" You soft and only/"+
		" You lost and lonely/"+
		" You just like heaven";
		
	String TFlameLyrics = " Another night slowly closes in/"+
		" And I feel so lonely/"+
		" Touching heat freezing on my skin/"+
		" I pretend you still hold me/"+
		" I'm going crazy, I'm losing sleep/"+
		" I'm in too far, I'm in way too deep over you/"+
		" I can't believe you're gone/"+
		" You were the first, you'll be the last/"+
		" Wherever you go, I'll be with you/"+
		" Whatever you want, I'll give it to you/"+ 
		" Whenever you need someone/"+
		" To lay your heart and head upon/"+
		" Remember, after the fire, after all the rain/"+
		" I will be the flame/"+
		" I will be the flame/"+
		" Watching shadows move across the wall/"+
		" I feel so frightened/"+
		" I wanna run to you, I wanna call/"+
		" But I've been hit by lightning/"+
		" Just can't stand up for fallin' apart/"+
		" Can't see through this veil across my heart, over you/"+
		" You'll always be the one/"+
		" You were the first, you'll be the last/"+
		" Wherever you go, I'll be with you/"+
		" Whatever you want, I'll give it to you/"+
		" Whenever you need someone/"+
		" To lay your heart and head upon/"+
		" Remember, after the fire, after all the rain/"+
		" I will be the flame/"+
		" I will be the flame/"+
		" I'm going crazy, I'm losing sleep/"+
		" I'm in too far, I'm in way too deep over you/"+
		" You'll always be the one/"+
		" You were the first, you'll be the last/"+
		" Wherever you go, I'll be with you/"+
		" Whatever you want, I'll give it to you/"+
		" Whenever you need someone/"+
		" To lay your heart and head upon/"+
		" Remember, after the fire, after all the rain/"+
		" I will be the flame/"+
		" I will be the flame/"+
		" Whatever you want, I'll give it to you/"+
		" Wherever you go, I'll be with you/"+
		" And whatever you want, I'll give it to you";   	   
		
	String YSSomethingLyrics = " On a rooftop in Brooklyn/"+
		" At one in the morning/"+
		" Watching the lights flash/"+
		" In Manhattan/"+
		" I see five bridges/"+
		" The Empire State Building/"+
		" And you said something/"+
		" That I've never forgotten/"+
		" We lean against railings/"+
		" Describing the colors/"+
		" And the smells of our homelands/"+
		" Acting like lovers/"+
		" How did we get here?/"+
		" To this point of living?/"+
		" I held my breath/"+
		" And you said something/"+
		" And I'm doing nothing wrong/"+
		" Riding in your car/"+
		" The radio playing/"+
		" We sing up to the eighth floor/"+
		" A rooftop, Manhattan/"+
		" At one in the morning/"+
		" And you said something/"+
		" That I've never forgotten/"+
		" You said something/"+
		" You said something/"+
		" You said something/"+
		" That was really important";
		
	String DIMoviesLyrics = " Late at night gazing out into the late at night/"+
		" I see deep in the world 'til I open my eyes/"+
		" Every day brakes screech outside my window/"+
		" Those crashing cars never seem to collide/"+
		" Sometimes when I'm staring out my window/"+
		" Catch the stars and watch as they go by/"+
		" I've been getting messages from outer space/"+
		" They spiral like a finger in the sky/"+
		" It blows my mind/"+
		" Every day I'm drawn to my window/"+
		" I can hear it if I open my eyes/"+
		" Sometimes flashing lights seem so familiar/"+
		" I know I've seen them circling me at night/"+
		" I've been sending signals into outer space/"+
		" They spiral like a finger in the sky/"+
		" It blows my mind/"+
		" Every day the restlessness takes over me/"+
		" I can see it as I'm closing my eyes/"+
		" I've been sending signals into outer space/"+
		" They spiral like a finger in the sky/"+
		" Like a finger in the sky/"+
		" Like a finger in the sky/"+
		" Like a finger in the sky/"+
		" Like a finger in the sky...";
		
	String JWINeededLyrics = " I don't mind you comin' here/"+
		" And wastin' all my time/"+
		" 'Cause when you're standin', oh so near/"+
		" I kinda lose my mind/"+
		" It's not the perfume that you wear/"+
		" It's not the ribbons in your hair/"+
		" And I don't mind you comin' here/"+
		" And wastin' all my time/"+
		" I don't mind you hangin' out/"+
		" And talkin' in your sleep/"+
		" It doesn't matter where you've been/"+
		" As long as it was deep, yeah/"+
		" You always knew to wear it well and/"+
		" You look so fancy I can tell/"+
		" I don't mind you hangin' out/"+
		" And talkin' in your sleep/"+
		" I guess, you're just what I needed/"+
		" I needed someone to feed/"+
		" I guess, you're just what I needed/"+
		" I needed someone to bleed/"+
		" I don't mind you comin' here/"+
		" And wastin' all my time, time/"+
		" 'Cause when you're standin', oh so near/"+
		" I kinda lose my mind, yeah/"+
		" It's not the perfume that you wear/"+
		" It's not the ribbons in your hair/"+
		" I don't mind you comin' here/"+
		" And wastin' all my time/"+
		" I guess, you're just what I needed/"+
		" I needed someone to feed/"+
		" I guess, you're just what I needed/"+
		" I needed someone to bleed/"+
		" I guess, you're just what I needed/"+
		" I needed someone to feed/"+
		" I guess, you're just what I needed/"+
		" I needed someone to bleed/"+
		" Yeah, yeah, so bleed me/"+
		" You're just what I needed/"+
		" You're just what I needed/"+
		" You're just what I needed/"+
		" Yeah, yeah, yeah";
		
	String KOffLyrics = " I need someone a person to talk to/"+
		" Someone who'd care to love/"+
		" Could it be you, could it be you?/"+
		" Situation gets rough then I start to panic/"+
		" It's not enough it's just a habit/"+
		" Hey kid, you're sick, well, darling this is it/"+
		" You can all just kiss off into the air/"+
		" Behind my back I can see them stare/"+
		" They'll hurt me bad, but I won't mind/"+
		" They'll hurt me bad, they do it all the time/"+
		" Yeah, yeah, they do it all the time, yeah, yeah/"+
		" They do it all the time (do it all the time)/"+
		" They do it all the time (do it all the time)/"+
		" They do it all the time, do it all the time/"+
		" I hope you know that this will go down /"+
		" On your permanent record/"+
		" Oh, yeah, well, don't get so distressed/"+
		" Did I happen to mention that I'm impressed/"+
		" I take one, one, one 'cause you left me/"+
		" And two, two, two for my family/"+
		" And three, three, three for my heartache/"+
		" And four, four, four for my headaches/"+ 
		" And five, five, five for my lonely/"+
		" And six, six, six for my sorrow/"+
		" And seven, seven for no tomorrow/"+
		" And eight eight I forget what eight was for/"+
		" And nine nine nine for a lost God/"+
		" And ten, ten, ten, ten for everything, everything, everything, everything/"+
		" You can all just kiss off into the air/"+
		" Behind my back I can see them stare/"+
		" They'll hurt me bad but I won't mind/"+
		" They'll hurt me bad they do it all the time/"+
		" Yeah, yeah, they do it all the time, yeah, yeah/"+
		" They do it all the time (do it all the time)/"+
		" They do it all the time (do it all the time)/"+
		" They do it all the time (do it all the time, do it all the time)/"+
		" Do it all the time";
		
	String WAYoungLyrics = " Give me a second I, I need to get my story straight/"+
		" My friends are in the bathroom getting higher than the Empire State/"+
		" My lover she's waiting for me just across the bar/"+
		" My seat's been taken by some sunglasses asking 'bout a scar/"+
		" And I know I gave it to you months ago/"+
		" I know you're trying to forget/"+
		" But between the drinks and subtle things, the holes in my apologies/"+
		" You know I'm trying hard to take it back/"+
		" So if by the time the bar closes/"+
		" And you feel like falling down/"+
		" I'll carry you home/"+
		" Tonight/"+
		" We are young/"+
		" So let's set the world on fire/"+
		" We can burn brighter/"+
		" Than the sun/"+
		" Tonight/"+
		" We are young/"+
		" So let's set the world on fire/"+
		" We can burn brighter/"+
		" Than the sun/"+
		" Now I know that I'm not/"+
		" All that you got/"+
		" I guess that I, I just thought/"+
		" Maybe we could find new ways to fall apart/"+
		" But our friends are back/"+
		" So let's raise a cup/"+
		" Cause I found someone to carry me home/"+
		" Tonight/"+
		" We are young/"+
		" So let's set the world on fire/"+
		" We can burn brighter/"+
		" Than the sun/"+
		" Tonight/"+
		" We are young/"+
		" So let's set the world on fire/"+
		" We can burn brighter/"+
		" Than the sun/"+
		" Carry me home tonight/"+
		" Just carry me home tonight/"+
		" Carry me home tonight/"+
		" Just carry me home tonight/"+
		" The moon is on my side/"+
		" I have no reason to run/"+
		" So will someone come and carry me home tonight/"+
		" The angels never arrived/"+
		" But I can hear the choir/"+
		" So will someone come and carry me home/"+
		" Tonight/"+
		" We are young/"+
		" So let's set the world on fire/"+
		" We can burn brighter/"+
		" Than the sun/"+
		" Tonight/"+
		" We are young/"+
		" So let's set the world on fire/"+
		" We can burn brighter/"+
		" Than the sun/"+
		" So if by the time the bar closes/"+
		" And you feel like falling down/"+
		" I'll carry you home tonight";
		
	String BLTriangleLyrics = "	Every time I think of you/"+
		" I feel shot right through with a bolt of blue/"+
		" It's no problem of mine/"+
		" But it's a problem I find/"+
		" Living a life that I can't leave behind/"+
		" But there's no sense in telling me/"+
		" The wisdom of the fool won't set you free/"+
		" But that's the way that it goes/"+
		" And it's what nobody knows/"+
		" Well every day my confusion grows/"+
		" Every time I see you falling/"+
		" I get down on my knees and pray/"+
		" I'm waiting for that final moment/"+
		" You say the words that I can't say/"+
		" I feel fine and I feel good/"+
		" I'm feeling like I never should/"+
		" Whenever I get this way/"+
		" I just don't know what to say/"+
		" Why can't we be ourselves like we were yesterday/"+
		" I'm not sure what this could mean/"+
		" I don't think you're what you seem/"+
		" I do admit to myself/"+
		" That if I hurt someone else/"+
		" Then I'll never see just what we're meant to be/"+
		" Every time I see you falling/"+
		" I get down on my knees and pray/"+
		" I'm waiting for that final moment/"+
		" You say the words that I can't say/"+
		" Ah ah ah ah ah ah ah ah ah ah ah ah/"+
		" Ah ah ah ah ah ah ah ah ah ah ah ah/"+
		" Ah ah ah ah ah ah ah ah ah ah ah ah/"+
		" (Every time I see you falling/"+
		" I get down on my knees and pray/"+
		" I'm waiting for that final moment/"+
		" You say the words that I can't say/"+
		" Every time I see you falling/"+
		" I get down on my knees and pray/"+
		" I'm waiting for that final moment/"+
		" You say the words that I can't say)/"+
		" Every time I see you falling/"+
		" I get down on my knees and pray/"+
		" I'm waiting for that final moment/"+
		" You say the words that I can't say";
		
	String PompeiiLyrics = " I was left to my own devices/"+
		" Many days fell away with nothing to show/"+
		" And the walls kept tumbling down/"+
		" In the city that we love/"+
		" Grey clouds roll over the hills/"+
		" Bringing darkness from above/"+
		" But if you close your eyes/"+
		" Does it almost feel like/"+
		" Nothing changed at all?/"+
		" And if you close your eyes/"+
		" Does it almost feel like/"+
		" You've been here before?/"+
		" But if you close your eyes/"+
		" Does it almost feel like/"+
		" Nothing changed at all?/"+
		" And if you close your eyes/"+
		" Does it almost feel like/"+
		" You've been here before?/"+
		" Nothing changed at all/"+
		" Nothing changed at all/"+
		" We were caught up and lost in all of our vices/"+
		" In your pose as the dust settled around us/"+
		" And the walls kept tumbling down/"+
		" In the city that we love/"+
		" Grey clouds roll over the hills/"+
		" Bringing darkness from above/"+
		" But if you close your eyes/"+
		" Does it almost feel like/"+
		" Nothing changed at all?/"+
		" And if you close your eyes/"+
		" Does it almost feel like/"+
		" You've been here before?/"+
		" Nothing changed at all/"+
		" Nothing changed at all/"+
		" Oh where do we begin?/"+
		" The rubble or our sins?/"+
		" Oh where do we begin?/"+
		" The rubble or our sins?/"+
		" But if you close your eyes/"+
		" Does it almost feel like/"+
		" Nothing changed at all?/"+
		" And if you close your eyes/"+
		" Does it almost feel like/"+
		" You've been here before?/"+
		" Nothing changed at all/"+
		" Nothing changed at all";
}