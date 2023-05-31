package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamClass {
	
	public static void main(String[] args) {
		
		
		List<Movie> movielist = Arrays.asList(new Movie("M1",2021,"A1"),new Movie("M2",2021,"A2"),new Movie("M3",2019,"A3"),new Movie("M4",2020,"A4")) ;
		
		movielist.stream()
		.filter(m -> m.getYear() == 2025)
//		.map(m -> m.getActor())
		.map(Movie :: getActor)
		.forEach(System.out :: println);
		
		List<String> movies = movielist.stream().map(Movie :: getActor).collect(Collectors.toList());
//		movies.forEach(System.out :: println);
		
		Set<String> set = movielist.stream().map(Movie :: getActor).collect(Collectors.toSet());
//		set.forEach(System.out :: println);
		
		String str = movielist.stream().map(Movie :: getActor).collect(Collectors.joining(","));
//		System.out.println(str);
		
		Map<Integer, List<Movie>> mapp =  movielist.stream().filter(m -> m.getYear() == 2021).collect(Collectors.groupingBy(Movie :: getYear));
		
//    	mapp.forEach((k,v) -> System.out.println("key "+k+" value"+v) );
		
		double dmovie = movielist.stream().collect(Collectors.averagingInt(Movie :: getYear));
//		System.out.println(dmovie);
		
		Map<Boolean, List<Movie> > booleanmovie = movielist.stream().collect(Collectors.partitioningBy(m ->m.getYear() >=2019) );
		booleanmovie.forEach((k,v) -> System.out.println("key = "+k +" value = "+v ));

		
	}

}
