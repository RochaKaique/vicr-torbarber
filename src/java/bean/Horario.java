package bean;
// Generated 05/05/2017 15:52:32 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Horario generated by hbm2java
 */
@Entity
@Table(name="horario"
    ,catalog="victor_barber_db"
)
public class Horario  implements java.io.Serializable {


     private Integer id;
     private Integer servico;
     private String observacao;
     private Date horarioInicio;
     private Date horarioFim;

    public Horario() {
    }

	
    public Horario(Integer servico) {
        this.servico = servico;
    }
    public Horario(Integer servico, String observacao, Date horarioInicio, Date horarioFim) {
       this.servico = servico;
       this.observacao = observacao;
       this.horarioInicio = horarioInicio;
       this.horarioFim = horarioFim;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @JoinColumn(name="SERVICO_FK", nullable=false)
    public Integer getServico() {
        return this.servico;
    }
    
    public void setServico(Integer servico) {
        this.servico = servico;
    }

    
    @Column(name="OBSERVACAO", length=65535)
    public String getObservacao() {
        return this.observacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="HORARIO_INICIO", length=19)
    public Date getHorarioInicio() {
        return this.horarioInicio;
    }
    
    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="HORARIO_FIM", length=19)
    public Date getHorarioFim() {
        return this.horarioFim;
    }
    
    public void setHorarioFim(Date horarioFim) {
        this.horarioFim = horarioFim;
    }




}


