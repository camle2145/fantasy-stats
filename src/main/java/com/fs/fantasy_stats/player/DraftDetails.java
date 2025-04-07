package com.fs.fantasy_stats.player;

public class DraftDetails {

    private Integer draftYear;
    private String college;
    private Integer draftRound;
    private Integer draftPick;
    private Integer draftRookieAdp;
    private Integer draft2QBRookieAdp;

    public DraftDetails() {
    }

    public DraftDetails(Integer draftYear, String college, Integer draftRound,
                        Integer draftPick, Integer draftRookieAdp, Integer draft2QBRookieAdp) {
        this.draftYear = draftYear;
        this.college = college;
        this.draftRound = draftRound;
        this.draftPick = draftPick;
        this.draftRookieAdp = draftRookieAdp;
        this.draft2QBRookieAdp = draft2QBRookieAdp;
    }

    public Integer getDraftYear() {
        return draftYear;
    }

    public void setDraftYear(Integer draftYear) {
        this.draftYear = draftYear;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public Integer getDraftRound() {
        return draftRound;
    }

    public void setDraftRound(Integer draftRound) {
        this.draftRound = draftRound;
    }

    public Integer getDraftPick() {
        return draftPick;
    }

    public void setDraftPick(Integer draftPick) {
        this.draftPick = draftPick;
    }

    public Integer getDraftRookieAdp() {
        return draftRookieAdp;
    }

    public void setDraftRookieAdp(Integer draftRookieAdp) {
        this.draftRookieAdp = draftRookieAdp;
    }

    public Integer getDraft2QBRookieAdp() {
        return draft2QBRookieAdp;
    }

    public void setDraft2QBRookieAdp(Integer draft2QBRookieAdp) {
        this.draft2QBRookieAdp = draft2QBRookieAdp;
    }
}
