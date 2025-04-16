@import com.agenciaviagens.dto.Page

@template.layout.main(
page = new Page("Cadastro de Usuários"),
content = @`

<section class="formulario-container">
    <!-- Área para Foto Expandida -->
    <div class="caixa-conteudo">
        <div class="upload-de-foto lado-a-lado">
            <span>+</span>
        </div>

        <form action="" method="post" class="campos-formulario lado-a-lado">

            <fieldset>
                <legend>Dados Pessoais</legend>

                <div class="caixa lado-a-lado">
                    <div class="caixa-input"><input type="text" placeholder="Nome *" class="input-sem-ponta" required>
                    </div>
                    <div class="caixa-input"><input type="email" placeholder="E-mail *" class="input-sem-ponta"
                            required></div>
                </div>

                <div class="caixa lado-a-lado">
                    <div class="caixa-input">
                        <div class="lado-mesclado">
                            <input type="tel" placeholder="Telefone *" class="telefone" required>
                            <select name="tipo_contato1" class="telefone-selecao" required>
                                <option value="" disabled selected>Selecione...</option>
                                <option value="telefone">Phone</option>
                                <option value="telegram">Telegram</option>
                                <option value="whatsapp">WhatsApp</option>
                            </select>
                        </div>
                    </div>

                    <div class="caixa-input">
                        <div class="lado-mesclado">
                            <input type="tel" placeholder="Telefone" class="telefone">
                            <select name="tipo_contato2" class="telefone-selecao">
                                <option value="" disabled selected>Selecione...</option>
                                <option value="telefone">Phone</option>
                                <option value="telegram">Telegram</option>
                                <option value="whatsapp">WhatsApp</option>
                            </select>
                        </div>
                    </div>
                </div>

            </fieldset>

            <button class="btn-salvar">
                <img src="/assets/icons/icone-botao-de-salvar.svg" class="icone">Salvar
            </button>
        </form>
    </div>
</section>

`)