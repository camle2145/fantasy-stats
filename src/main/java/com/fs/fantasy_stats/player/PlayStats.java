package com.fs.fantasy_stats.player;

public class PlayStats {

    private Integer offSnaps;
    private Double offSnapsPct;
    private Integer gms;
    private Integer paATTs;
    private Integer paCMPs;
    private Integer paYDs;
    private Integer paTDs;
    private Integer paINTs;
    private Double paAya;
    private Integer tmPaATTs;
    private Integer ruATTs;
    private Integer ruYDs;
    private Integer ruTDs;
    private Integer tmRuATTs;
    private Integer tmRuYDs;
    private Double msRuATTs;
    private Integer tgts;
    private Integer recs;
    private Integer reYDs;
    private Integer reTDs;
    private Integer reAYDs;
    private Double wopr;
    private Double racr;
    private Double adot;
    private Integer yac;
    private Double msTgts;
    private Double msAYDs;
    private Integer tmTgts;
    private Integer tmAYDs;
    private Integer firstDs;
    private Integer tm1Ds;
    private Double ms1Ds;
    private Double ppr;
    private Double pprG;

    public PlayStats() {
    }

    public PlayStats(Integer offSnaps, Double offSnapsPct, Integer gms, Integer paATTs, 
                     Integer paCMPs, Integer paYDs, Integer paTDs,
                     Integer paINTs, Double paAya, Integer tmPaATTs,
                     Integer ruATTs, Integer ruYDs, Integer ruTDs,
                     Integer tmRuATTs, Integer tmRuYDs, Double msRuATTs,
                     Integer tgts, Integer recs, Integer reYDs, Integer reTDs,
                     Integer reAYDs, Double wopr, Double racr, Double adot,
                     Integer yac, Double msTgts, Double msAYDs, Integer tmTgts,
                     Integer tmAYDs, Integer firstDs, Integer tm1Ds, Double ms1Ds,
                     Double ppr, Double pprG) {
        this.offSnaps = offSnaps;
        this.offSnapsPct = offSnapsPct;
        this.gms = gms;
        this.paATTs = paATTs;
        this.paCMPs = paCMPs;
        this.paYDs = paYDs;
        this.paTDs = paTDs;
        this.paINTs = paINTs;
        this.paAya = paAya;
        this.tmPaATTs = tmPaATTs;
        this.ruATTs = ruATTs;
        this.ruYDs = ruYDs;
        this.ruTDs = ruTDs;
        this.tmRuATTs = tmRuATTs;
        this.tmRuYDs = tmRuYDs;
        this.msRuATTs = msRuATTs;
        this.tgts = tgts;
        this.recs = recs;
        this.reYDs = reYDs;
        this.reTDs = reTDs;
        this.reAYDs = reAYDs;
        this.wopr = wopr;
        this.racr = racr;
        this.adot = adot;
        this.yac = yac;
        this.msTgts = msTgts;
        this.msAYDs = msAYDs;
        this.tmTgts = tmTgts;
        this.tmAYDs = tmAYDs;
        this.firstDs = firstDs;
        this.tm1Ds = tm1Ds;
        this.ms1Ds = ms1Ds;
        this.ppr = ppr;
        this.pprG = pprG;
    }

    public Integer getOffSnaps() {
        return offSnaps;
    }

    public void setOffSnaps(Integer offSnaps) {
        this.offSnaps = offSnaps;
    }

    public Double getOffSnapsPct() {
        return offSnapsPct;
    }

    public void setOffSnapsPct(Double offSnapsPct) {
        this.offSnapsPct = offSnapsPct;
    }

    public Integer getGms() {
        return gms;
    }

    public void setGms(Integer gms) {
        this.gms = gms;
    }

    public Integer getPaATTs() {
        return paATTs;
    }

    public void setPaATTs(Integer paATTs) {
        this.paATTs = paATTs;
    }

    public Integer getPaCMPs() {
        return paCMPs;
    }

    public void setPaCMPs(Integer paCMPs) {
        this.paCMPs = paCMPs;
    }

    public Integer getPaYDs() {
        return paYDs;
    }

    public void setPaYDs(Integer paYDs) {
        this.paYDs = paYDs;
    }

    public Integer getPaTDs() {
        return paTDs;
    }

    public void setPaTDs(Integer paTDs) {
        this.paTDs = paTDs;
    }

    public Integer getPaINTs() {
        return paINTs;
    }

    public void setPaINTs(Integer paINTs) {
        this.paINTs = paINTs;
    }

    public Double getPaAya() {
        return paAya;
    }

    public void setPaAya(Double paAya) {
        this.paAya = paAya;
    }

    public Integer getTmPaATTs() {
        return tmPaATTs;
    }

    public void setTmPaATTs(Integer tmPaATTs) {
        this.tmPaATTs = tmPaATTs;
    }

    public Integer getRuATTs() {
        return ruATTs;
    }

    public void setRuATTs(Integer ruATTs) {
        this.ruATTs = ruATTs;
    }

    public Integer getRuYDs() {
        return ruYDs;
    }

    public void setRuYDs(Integer ruYDs) {
        this.ruYDs = ruYDs;
    }

    public Integer getRuTDs() {
        return ruTDs;
    }

    public void setRuTDs(Integer ruTDs) {
        this.ruTDs = ruTDs;
    }

    public Integer getTmRuATTs() {
        return tmRuATTs;
    }

    public void setTmRuATTs(Integer tmRuATTs) {
        this.tmRuATTs = tmRuATTs;
    }

    public Integer getTmRuYDs() {
        return tmRuYDs;
    }

    public void setTmRuYDs(Integer tmRuYDs) {
        this.tmRuYDs = tmRuYDs;
    }

    public Double getMsRuATTs() {
        return msRuATTs;
    }

    public void setMsRuATTs(Double msRuATTs) {
        this.msRuATTs = msRuATTs;
    }

    public Integer getTgts() {
        return tgts;
    }

    public void setTgts(Integer tgts) {
        this.tgts = tgts;
    }

    public Integer getRecs() {
        return recs;
    }

    public void setRecs(Integer recs) {
        this.recs = recs;
    }

    public Integer getReYDs() {
        return reYDs;
    }

    public void setReYDs(Integer reYDs) {
        this.reYDs = reYDs;
    }

    public Integer getReTDs() {
        return reTDs;
    }

    public void setReTDs(Integer reTDs) {
        this.reTDs = reTDs;
    }

    public Integer getReAYDs() {
        return reAYDs;
    }

    public void setReAYDs(Integer reAYDs) {
        this.reAYDs = reAYDs;
    }

    public Double getWopr() {
        return wopr;
    }

    public void setWopr(Double wopr) {
        this.wopr = wopr;
    }

    public Double getRacr() {
        return racr;
    }

    public void setRacr(Double racr) {
        this.racr = racr;
    }

    public Double getAdot() {
        return adot;
    }

    public void setAdot(Double adot) {
        this.adot = adot;
    }

    public Integer getYac() {
        return yac;
    }

    public void setYac(Integer yac) {
        this.yac = yac;
    }

    public Double getMsTgts() {
        return msTgts;
    }

    public void setMsTgts(Double msTgts) {
        this.msTgts = msTgts;
    }

    public Double getMsAYDs() {
        return msAYDs;
    }

    public void setMsAYDs(Double msAYDs) {
        this.msAYDs = msAYDs;
    }

    public Integer getTmTgts() {
        return tmTgts;
    }

    public void setTmTgts(Integer tmTgts) {
        this.tmTgts = tmTgts;
    }

    public Integer getTmAYDs() {
        return tmAYDs;
    }

    public void setTmAYDs(Integer tmAYDs) {
        this.tmAYDs = tmAYDs;
    }

    public Integer getFirstDs() {
        return firstDs;
    }

    public void setFirstDs(Integer firstDs) {
        this.firstDs = firstDs;
    }

    public Integer getTm1Ds() {
        return tm1Ds;
    }

    public void setTm1Ds(Integer tm1Ds) {
        this.tm1Ds = tm1Ds;
    }

    public Double getMs1Ds() {
        return ms1Ds;
    }

    public void setMs1Ds(Double ms1Ds) {
        this.ms1Ds = ms1Ds;
    }

    public Double getPpr() {
        return ppr;
    }

    public void setPpr(Double ppr) {
        this.ppr = ppr;
    }

    public Double getPprG() {
        return pprG;
    }

    public void setPprG(Double pprG) {
        this.pprG = pprG;
    }
}
