package com.raghu.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentInfoDTOMain {

	
	public static void main(String[] args) {
		
		List <StudentInfoDTO> students= new ArrayList<StudentInfoDTO>();
		students.add(new StudentInfoDTO(123, "Arun", 23.45, "CS"));
		students.add(new StudentInfoDTO(124, "Kiran", 23.45, "CS"));
		students.add(new StudentInfoDTO(125, "Varn", 23.45, "CS"));
		students.add(new StudentInfoDTO(126, "Charan", 23.45, "CS"));
		students.add(new StudentInfoDTO(127, "tarun", 23.45, "CS"));
		students.add(new StudentInfoDTO(128, "Praveen", 23.45, "CS"));
		
		
		students.stream()
					.sorted((s1, s2)-> -s1.getPer().compareTo(s2.getPer()))
					.forEach(System.out::println);
		
		Map<String, List<StudentInfoDTO>> ms = students.stream()
															.collect(Collectors.groupingBy(StudentInfoDTO:: getDept,Collectors.toList()));
		ms.entrySet().forEach((k)-> System.out.println(k.getKey()+" -> "+k.getValue()));
//		bc.e
				
		
//		
//		Comparator<StudentInfoDTO> cper=(s1, s2)->s1.getPer().compareTo(s2.getPer());
//		Map<String, Optional<StudentInfoDTO>> bh=students.stream()
//														.collect(Collectors.groupingBy(students));
		
		
		// Highest scorer
		/**
		
		StudentInfoDTO std = students.stream()
										.max(Comparator.comparingDouble(StudentInfoDTO::getPer))
										.get();
		System.out.println(std);
		 */
		
		
		//4th higest scorer
//	students.stream()
//	.sorted((s1, s2) ->s1.getPer().compareTo(s2.getPer()))
//	.skip(3)
//	.limit(1)
//	.forEach(System.out::println);
		
	}
}
