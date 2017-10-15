
// in java List<Integer> list = Arrays.asList(1, 2, 3);
List list = [1, 2, 3]

println "in Groovy:"
list.each {
    println it
}

println "in java:"
for (def i = 0; i < list.size(); i++) {
    System.out.println(list[i]);
}
