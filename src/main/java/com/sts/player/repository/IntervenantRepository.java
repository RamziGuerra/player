package com.sts.player.repository;

import com.sts.player.entity.Intervenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IntervenantRepository extends JpaRepository<Intervenant, Long> {
    @Query(nativeQuery = true, value = "SELECT div.name AS division, team.initials AS team_initial, team.name AS team_name, interv_type.libelle AS type_interv, interv.licence_num AS num_licence, interv.name AS name, interv.last_name AS last_name, interv.date_of_birth AS date_naissance, pays.libelle AS nationalite, player_categ.label AS categorie, team_interv.tshirt_num AS player_num, team_interv.ct_season_id AS season, interv_photo.photo_bdata AS photo FROM sss_competition_db.ct_team_intervenants AS team_interv LEFT OUTER JOIN sss_competition_db.ct_intervenants AS interv ON interv.ct_intervenant_id = team_interv.ct_intervenant_id LEFT OUTER JOIN sss_config_general_db.cr_pays AS pays ON pays.cr_pays_id = interv.cr_pays_id LEFT OUTER JOIN sss_competition_db.ct_teams AS team ON team.ct_team_id = team_interv.ct_team_id LEFT OUTER JOIN sss_competition_db.ct_player_categorys AS player_categ ON player_categ.ct_player_category_id = team_interv.ct_player_category_id LEFT OUTER JOIN sss_competition_db.ct_intervenant_types AS interv_type ON interv_type.ct_intervenant_type_id = team_interv.ct_intervenant_type_id LEFT OUTER JOIN sss_competition_db.ct_team_divisions AS team_div ON team_div.ct_season_id = team_interv.ct_season_id AND team_div.ct_team_id = team_interv.ct_team_id LEFT OUTER JOIN sss_competition_db.ct_divisions AS div ON div.ct_division_id = team_div.ct_division_id LEFT OUTER JOIN sss_competition_db.ct_team_intervenant_photos AS interv_photo ON interv_photo.ct_team_intervenant_photo_id = team_interv.ct_team_intervenant_photo_id WHERE interv.licence_num = :licenceNum ORDER BY div.name, team.initials, type_interv, team_interv.ct_season_id, player_categ.label")
    List<Object[]> findIntervenantWithHistory(@Param("licenceNum") String licenceNum);
}
