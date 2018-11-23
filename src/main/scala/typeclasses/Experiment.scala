package typeclasses

object Experiment {
  /*
      Currently, the Scala compiler allows checking equality between different types ->
          which, obviously, for 99% of cases, yields false.
      Some argue that this kind of behaviour shouldn't be allowed
          and equality should be checked only between instances of the same type.

      Create an Eq typeclass which has 1 function which checks the equality with another instance of the same type.
      Continue by providing a few implicit instances and a function which checks equality between 2 instances of the same type.
      A final step would be to provide an implicit class which has the before-mentioned functioned to have the sweet syntax.
   */
}
