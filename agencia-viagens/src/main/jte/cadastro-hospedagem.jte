@template.layout.main(
page = new Page("Cadastro de Hospedagens"),
content = @`
    <section class="formulario-conteiner">
        <!-- Área para Foto Expandida -->
        <div class="envio-de-foto">
            <input type="file" id="file-upload" name="foto" class="input-file">
            <label for="file-upload" class="file-label">
                <span>+</span>
                <p>Clique aqui para adicionar uma Foto</p>
            </label>
        </div>

        <!-- Campos do Formulário -->
        <form action="/hospedagens/salvar" method="post" enctype="multipart/form-data" class="campos-formulario">
            <fieldset>
                <legend>Dados da Hospedagem</legend>
                <div class="caixa lado-a-lado">
                    <div class="caixa-input">
                        <input type="text" placeholder="Nome" name="nome" class="input-sem-ponta" required>
                    </div>
                    <div class="caixa-input">
                        <input type="email" placeholder="E-mail" name="email" class="input-sem-ponta" required>
                    </div>
                </div>

                <div class="caixa lado-a-lado">
                    <div class="caixa-input">
                        <div class="lado-mesclado">
                            <input type="tel" placeholder="Telefone" name="telefones[0].numero" class="telefone" required>
                            <select name="telefones[0].tipo" class="telefone-selecao" required>
                                <option value="" disabled selected>Selecione...</option>
                                <option value="Phone">Phone</option>
                                <option value="Telegram">Telegram</option>
                                <option value="WhatsApp">WhatsApp</option>
                            </select>
                        </div>
                    </div>

                    <div class="caixa-input">
                        <div class="lado-mesclado">
                            <input type="tel" placeholder="Telefone" name="telefones[1].numero" class="telefone">
                            <select name="telefones[1].tipo" class="telefone-selecao">
                                <option value="" disabled selected>Selecione...</option>
                                <option value="Phone">Phone</option>
                                <option value="Telegram">Telegram</option>
                                <option value="WhatsApp">WhatsApp</option>
                            </select>
                        </div>
                    </div>
                </div>
            </fieldset>

            <fieldset>
                <legend>Endereço da Hospedagem</legend>
                <div class="caixa lado-a-lado">
                    <div class="caixa-input">
                        <input type="text" placeholder="País" name="endereco.pais" class="input-sem-ponta">
                    </div>
                    <div class="caixa-input">
                        <input type="text" placeholder="Estado" name="endereco.estado" class="input-sem-ponta">
                    </div>
                    <div class="caixa-input">
                        <input type="text" placeholder="Cidade" name="endereco.cidade" class="input-sem-ponta">
                    </div>
                    <div class="caixa-input">
                        <input type="text" placeholder="Bairro" name="endereco.bairro" class="input-sem-ponta">
                    </div>
                </div>

                <div class="caixa lado-a-lado">
                    <div class="caixa-input">
                        <input type="text" placeholder="Logradouro" name="endereco.logradouro" class="input-sem-ponta">
                    </div>
                    <div class="caixa-input">
                        <input type="text" placeholder="Número" name="endereco.numero" class="input-sem-ponta">
                    </div>
                    <div class="caixa-input">
                        <input type="text" placeholder="Complemento" name="endereco.complemento" class="input-sem-ponta">
                    </div>
                </div>
            </fieldset>

            <!-- Botão de Salvar -->
            <button type="submit" class="btn-salvar">
                <img src="/assets/icons/icone-botao-de-salvar.svg" class="icone">Salvar
            </button>
        </form>
    </section>
`)