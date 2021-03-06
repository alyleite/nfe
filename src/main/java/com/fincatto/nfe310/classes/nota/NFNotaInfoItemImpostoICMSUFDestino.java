package com.fincatto.nfe310.classes.nota;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

import com.fincatto.nfe310.classes.NFBase;
import com.fincatto.nfe310.validadores.BigDecimalParser;

public class NFNotaInfoItemImpostoICMSUFDestino extends NFBase {
    @Element(name = "vBCUFDest", required = true)
    private String valorBaseCalculoDestino;

    @Element(name = "pFCPUFDest", required = true)
    private String percentualRelativoFundoCombatePobrezaDestino;

    @Element(name = "pICMSUFDest", required = true)
    private String percentualAliquotaInternaDestino;

    @Element(name = "pICMSInter", required = true)
    private String percentualInterestadual;

    @Element(name = "pICMSInterPart", required = true)
    private String percentualProvisorioPartilha;

    @Element(name = "vFCPUFDest", required = true)
    private String valorRelativoFundoCombatePobrezaDestino;

    @Element(name = "vICMSUFDest", required = true)
    private String valorICMSInterestadualDestino;

    @Element(name = "vICMSUFRemet", required = true)
    private String valorICMSInterestadualRemetente;

    public String getValorBaseCalculoDestino() {
        return this.valorBaseCalculoDestino;
    }

    public void setValorBaseCalculoDestino(final BigDecimal valorBaseCalculoDestino) {
        this.valorBaseCalculoDestino = BigDecimalParser.tamanho15Com2CasasDecimais(valorBaseCalculoDestino);
    }

    public String getPercentualRelativoFundoCombatePobrezaDestino() {
        return this.percentualRelativoFundoCombatePobrezaDestino;
    }

    public void setPercentualRelativoFundoCombatePobrezaDestino(final BigDecimal percentualRelativoFundoCombatePobrezaDestino) {
        this.percentualRelativoFundoCombatePobrezaDestino = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualRelativoFundoCombatePobrezaDestino);
    }

    public String getPercentualAliquotaInternaDestino() {
        return this.percentualAliquotaInternaDestino;
    }

    public void setPercentualAliquotaInternaDestino(final BigDecimal percentualAliquotaInternaDestino) {
        this.percentualAliquotaInternaDestino = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualAliquotaInternaDestino);
    }

    public String getPercentualInterestadual() {
        return this.percentualInterestadual;
    }

    public void setPercentualInterestadual(final BigDecimal percentualInterestadual) {
        this.percentualInterestadual = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualInterestadual);
    }

    public String getPercentualProvisorioPartilha() {
        return this.percentualProvisorioPartilha;
    }

    public void setPercentualProvisorioPartilha(final BigDecimal percentualProvisorioPartilha) {
        this.percentualProvisorioPartilha = BigDecimalParser.tamanho7ComAte4CasasDecimais(percentualProvisorioPartilha);
    }

    public String getValorRelativoFundoCombatePobrezaDestino() {
        return this.valorRelativoFundoCombatePobrezaDestino;
    }

    public void setValorRelativoFundoCombatePobrezaDestino(final BigDecimal valorRelativoFundoCombatePobrezaDestino) {
        this.valorRelativoFundoCombatePobrezaDestino = BigDecimalParser.tamanho15Com2CasasDecimais(valorRelativoFundoCombatePobrezaDestino);
    }

    public String getValorICMSInterestadualDestino() {
        return this.valorICMSInterestadualDestino;
    }

    public void setValorICMSInterestadualDestino(final BigDecimal valorICMSInterestadualDestino) {
        this.valorICMSInterestadualDestino = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSInterestadualDestino);
    }

    public String getValorICMSInterestadualRemetente() {
        return this.valorICMSInterestadualRemetente;
    }

    public void setValorICMSInterestadualRemetente(final BigDecimal valorICMSInterestadualRemetente) {
        this.valorICMSInterestadualRemetente = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSInterestadualRemetente);
    }
}