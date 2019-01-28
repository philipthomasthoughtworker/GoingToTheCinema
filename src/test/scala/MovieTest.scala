class MovieTest extends org.scalatest.FunSuite {
    test("pass basic tests 1") {
        assert(Movie.movie(500, 15, 0.9) === 43)
    }

    test("pass basic tests 2") {
        assert(Movie.movie(100,10,0.95) === 24)
    }

    test("pass basic tests 3") {
        assert(Movie.movie(0,10,0.95) === 2)
    }

    test("pass basic tests 4") {
        assert(Movie.movie(724,3,0.82) === 247)
    }

   test("pass basic tests 1374, 18, 0.94") {
         assert(Movie.movie(1374, 18, 0.94) === 93)
    }


    // test("sdfsdfs") {
    //     // assert(scala.math.round(738) === scala.math.round(737.666666666))
    //     assert(scala.math.round(1656) === scala.math.round(1655.0493697289182))
    // }

    // test("sdfsdfsfsf") {

    //     println(scala.math.ceil(1655.0493697289182))
    //     //var perc = 0.9

    //     //println(perc)
    //     //println(scala.math.ceil(perc))

    //     //assert(perc == scala.math.ceil(perc))
    // }
}