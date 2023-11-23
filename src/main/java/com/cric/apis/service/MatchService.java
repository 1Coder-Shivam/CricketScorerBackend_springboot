package com.cric.apis.service;

import com.cric.apis.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    List<Match> getAllMatches();
    List<Match> getLiveMatches();
    List<List<String>> getPointTable();
}
