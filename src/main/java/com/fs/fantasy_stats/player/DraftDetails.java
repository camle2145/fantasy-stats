package com.fs.fantasy_stats.player;

public class DraftDetails {

    private int draftYear;
    private String college;
    private int draftRound;
    private int draftPick;
    private int draftRookieAdp;
    private int draft2QBRookieAdp;

    public DraftDetails() {
    }

    public DraftDetails(int draftYear, String college, int draftRound,
                        int draftPick, int draftRookieAdp, int draft2QBRookieAdp) {
        this.draftYear = draftYear;
        this.college = college;
        this.draftRound = draftRound;
        this.draftPick = draftPick;
        this.draftRookieAdp = draftRookieAdp;
        this.draft2QBRookieAdp = draft2QBRookieAdp;
    }

    public int getDraftYear() {
        return draftYear;
    }

    public void setDraftYear(int draftYear) {
        this.draftYear = draftYear;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getDraftRound() {
        return draftRound;
    }

    public void setDraftRound(int draftRound) {
        this.draftRound = draftRound;
    }

    public int getDraftPick() {
        return draftPick;
    }

    public void setDraftPick(int draftPick) {
        this.draftPick = draftPick;
    }

    public int getDraftRookieAdp() {
        return draftRookieAdp;
    }

    public void setDraftRookieAdp(int draftRookieAdp) {
        this.draftRookieAdp = draftRookieAdp;
    }

    public int getDraft2QBRookieAdp() {
        return draft2QBRookieAdp;
    }

    public void setDraft2QBRookieAdp(int draft2QBRookieAdp) {
        this.draft2QBRookieAdp = draft2QBRookieAdp;
    }
}
