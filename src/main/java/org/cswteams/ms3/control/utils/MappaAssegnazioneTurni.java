package org.cswteams.ms3.control.utils;

import org.cswteams.ms3.dto.concreteshift.GetAllConcreteShiftDTO;
import org.cswteams.ms3.entity.ConcreteShift;

import java.util.HashSet;
import java.util.Set;

public class MappaAssegnazioneTurni {


  /*  public static ConcreteShift assegnazioneTurnoDTOToEntity(GetAllConcreteShiftDTO dto) throws ShiftException {
        // FIXME: DA SISTEMARE, DEVE PRENDERLO DAL DB
        Shift turno = new Shift(dto.getIdTurno(), dto.getInizio().toLocalDateTime().toLocalTime(), dto.getFine().toLocalDateTime().toLocalTime(), MappaServizio.servizioDTOtoEntity(dto.getServizio()), dto.getTipologiaTurno(),dto.isGiornoSuccessivoTurno());
        Set<Utente> diGuardia = MappaUtenti.utenteDTOtoEntity(dto.getUtentiDiGuardia());
        Set<Utente> reperibili = MappaUtenti.utenteDTOtoEntity(dto.getUtentiReperibili());
        turno.setMansione(dto.getMansione());

        return new ConcreteShift(dto.getInizio().toLocalDateTime().toLocalDate(), turno, reperibili, diGuardia);
    }*/

    /*public static GetAllConcreteShiftDTO assegnazioneTurnoToDTO(AssegnazioneTurno entity) {
        ZoneId gmtZone = ZoneId.of("GMT");

        LocalDateTime localDateTimeInizio = LocalDateTime.of(entity.getData(), entity.getTurno().getOraInizio());
        Instant inizioInstant = localDateTimeInizio.atZone(gmtZone).toInstant();

        Duration durata = entity.getTurno().getDurata();
        Instant fineInstant = inizioInstant.plus(durata);

        long inizioEpoch = inizioInstant.getEpochSecond();
        long fineEpoch = fineInstant.getEpochSecond();

        Set<DoctorDTO> diGuardiaDto = MappaUtenti.utentiEntityToDTO(entity.getUtentiDiGuardia());
        Set<DoctorDTO> reperibiliDto = MappaUtenti.utentiEntityToDTO(entity.getUtentiReperibili());
        Set<DoctorDTO> rimossiDto = MappaUtenti.utentiEntityToDTO(entity.getRetiredDoctors());

        GetAllConcreteShiftDTO dto = new GetAllConcreteShiftDTO(
                entity.getId(),
                entity.getShift().getId(),
                inizioEpoch,
                fineEpoch,
                diGuardiaDto,
                reperibiliDto,
                MappaServizio.servizioEntitytoDTO(entity.getShift().getServizio()),
                entity.getShift().getTipologiaTurno(),
                entity.getShift().isReperibilitaAttiva()
        );
        dto.setMansione(entity.getShift).getMansione());
        dto.setRetiredUsers(rimossiDto);

        return dto;
    }*/

    public static Set<GetAllConcreteShiftDTO> assegnazioneTurnoToDTO(Set<ConcreteShift> turni) {
        Set<GetAllConcreteShiftDTO> getAllConcreteShiftDTOS = new HashSet<>();
        for (ConcreteShift entity : turni) {
            //getAllConcreteShiftDTOS.add(assegnazioneTurnoToDTO(entity));
        }
        return getAllConcreteShiftDTOS;
    }



}

