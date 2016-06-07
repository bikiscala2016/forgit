package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  
  //singleton
  printSet(singletonSet(1))
  
  //union
  printSet( union(singletonSet(5), union(singletonSet(5), singletonSet(6)  ) ) )
  
  //intersection
  printSet( intersect( union(singletonSet(5), union(singletonSet(5), singletonSet(6)  ) ), 
      union(singletonSet(5), union(singletonSet(6), singletonSet(2)  ) )) )
  
  //diff
      
  //forall
   println(forall( union(singletonSet(-2), union(singletonSet(-10), singletonSet(6)  ) ) , (x: Int) => x < 7 && x > -12 ))

   //exists
   println(exists( union(singletonSet(-2), union(singletonSet(-10), singletonSet(6)  ) ) , (x: Int) => x > 12 ))
   
   
   println( contains( map( singletonSet(2), (x) => x * x ) , 4) )
   
   printSet( map( singletonSet(2), (x) => x * x ) )
}
