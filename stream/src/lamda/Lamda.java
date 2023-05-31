package lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import stream.Movie;

public class Lamda {
	
	public static void main(String[] args) {
		
		LamdaInterface id = (int no1,int no2) -> {return no1+no2 ;};
		
		int result = id.test(100,100);
//		System.out.println(result);
		
//		LamdaInterface.test3();
		
		List<Movie> movielist = Arrays.asList(new Movie("M1",2021,"A1"),new Movie("M2",2021,"A2"),new Movie("M3",2019,"A3"),new Movie("M4",2020,"A4")) ;
           
		
//		getMovies(movielist,m ->m.getYear()==2021);
//		getMovies(movielist, m ->m.getActor().equalsIgnoreCase("A1"));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		list.sort(Integer :: compareTo);
//		list.forEach(l ->System.out.println(l));
//		list.forEach(System.out :: println);
		
		
		List<String> str = Arrays.asList("a","b","c","d");
		str.sort(String :: compareToIgnoreCase);
		str.forEach(System.out ::println);

	}
	
	private static void getMovies(List<Movie> movielist , Predicate<Movie> predict) {
		
		for(Movie m : movielist) {
			if(predict.test(m)) {
				System.out.println(m.getActor() +" is "+m.getName() );
			}
		}
	}

}
