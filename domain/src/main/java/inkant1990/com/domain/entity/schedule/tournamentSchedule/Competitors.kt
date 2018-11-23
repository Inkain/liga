package inkant1990.com.domain.entity.schedule.tournamentSchedule

data class Competitors
(
    val teamNameAway: String? = null,
    val teamIdAway: String? = null,
    val teamNameHome: String? = null,
    val teamIdAwayHome: String? = null,
    val scheduled: String? = null,
    val name: String? = null,
    val capacity: Int?,
    val cityName: String?
)