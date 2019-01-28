object Movie {

  def movie(card: Int, ticket: Int, perc: Double) : Int = {
        var numberOfTickets = 1
        var systemB = card + ticket * perc
        var systemA = ticket * numberOfTickets;

        while(scala.math.ceil(systemB) >= scala.math.round(systemA))
        {
            numberOfTickets += 1

            systemA = ticket * numberOfTickets
            systemB += ticket * scala.math.pow(perc, numberOfTickets - 1) * perc
        }

        numberOfTickets.toInt
    }  
}