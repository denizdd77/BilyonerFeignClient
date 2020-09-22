
package bilyonerclientfinal.demo.dto;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sportType",
    "eventId",
    "sbsEventId",
    "homeTeam",
    "awayTeam",
    "matchDate",
    "matchStatus",
    "following",
    "streamType",
    "neutral"
})
public class Event {

    @JsonProperty("sportType")
    private String sportType;
    @JsonProperty("eventId")
    private String eventId;
    @JsonProperty("sbsEventId")
    private Integer sbsEventId;
    @JsonProperty("homeTeam")
    private String homeTeam;
    @JsonProperty("awayTeam")
    private String awayTeam;
    @JsonProperty("matchDate")
    private String matchDate;
    @JsonProperty("matchStatus")
    private MatchStatus matchStatus;
    @JsonProperty("following")
    private Boolean following;
    @JsonProperty("streamType")
    private String streamType;
    @JsonProperty("neutral")
    private Integer neutral;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sportType")
    public String getSportType() {
        return sportType;
    }

    @JsonProperty("sportType")
    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    @JsonProperty("eventId")
    public String getEventId() {
        return eventId;
    }

    @JsonProperty("eventId")
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @JsonProperty("sbsEventId")
    public Integer getSbsEventId() {
        return sbsEventId;
    }

    @JsonProperty("sbsEventId")
    public void setSbsEventId(Integer sbsEventId) {
        this.sbsEventId = sbsEventId;
    }

    @JsonProperty("homeTeam")
    public String getHomeTeam() {
        return homeTeam;
    }

    @JsonProperty("homeTeam")
    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    @JsonProperty("awayTeam")
    public String getAwayTeam() {
        return awayTeam;
    }

    @JsonProperty("awayTeam")
    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    @JsonProperty("matchDate")
    public String getMatchDate() {
        return matchDate;
    }

    @JsonProperty("matchDate")
    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }

    @JsonProperty("matchStatus")
    public MatchStatus getMatchStatus() {
        return matchStatus;
    }

    @JsonProperty("matchStatus")
    public void setMatchStatus(MatchStatus matchStatus) {
        this.matchStatus = matchStatus;
    }

    @JsonProperty("following")
    public Boolean getFollowing() {
        return following;
    }

    @JsonProperty("following")
    public void setFollowing(Boolean following) {
        this.following = following;
    }

    @JsonProperty("streamType")
    public String getStreamType() {
        return streamType;
    }

    @JsonProperty("streamType")
    public void setStreamType(String streamType) {
        this.streamType = streamType;
    }

    @JsonProperty("neutral")
    public Integer getNeutral() {
        return neutral;
    }

    @JsonProperty("neutral")
    public void setNeutral(Integer neutral) {
        this.neutral = neutral;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
