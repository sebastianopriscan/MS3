import ScheduleView from "./ScheduleView.js"
import { AssegnazioneTurnoAPI } from '../../API/AssegnazioneTurnoAPI';
import { UtenteAPI } from '../../API/UtenteAPI';
import TemporaryDrawer from "../../components/common/BottomViewAssegnazioneTurno.js";
import { Stack } from "@mui/system";

class GlobalScheduleView extends ScheduleView {

  async componentDidMount() {

    let utenti = [];
    let turni = [];
    let turnoAPI = new AssegnazioneTurnoAPI();
    let utenteAPI = new UtenteAPI();

    utenti = await utenteAPI.getAllUser();
    turni = await turnoAPI.getGlobalTurn();
    console.log(localStorage.getItem("actor"))

    super.componentDidMount(turni, utenti);
  }


  render(){
    return (
      <Stack spacing={3}>
        {localStorage.getItem("actor")!=="USER" && localStorage.getItem("actor")!=="CONFIGURATOR" && <TemporaryDrawer onPostAssegnazione = {()=>{this.componentDidMount() ;}} ></TemporaryDrawer>}
        {super.render("global")}
      </Stack>
      );
  }
}
export default GlobalScheduleView;
