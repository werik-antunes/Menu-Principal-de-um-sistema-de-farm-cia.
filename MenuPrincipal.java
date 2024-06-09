package farmacia;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class MenuPrincipal extends JFrame {
	public MenuPrincipal() {
		setTitle("Sistema de Farmácia");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu cadastrosMenu = new JMenu("Cadastros");
		menuBar.add(cadastrosMenu);

		JMenuItem clientesItem = new JMenuItem("Clientes");
		clientesItem.addActionListener(e -> new FormularioCliente().setVisible(true));
		cadastrosMenu.add(clientesItem);

		JMenuItem produtosItem = new JMenuItem("Produtos");
		produtosItem.addActionListener(e -> new FormularioProduto().setVisible(true));
		cadastrosMenu.add(produtosItem);

		JMenuItem fornecedoresItem = new JMenuItem("Fornecedores");
		fornecedoresItem.addActionListener(e -> new FormularioFornecedor().setVisible(true));
		cadastrosMenu.add(fornecedoresItem);

		JMenuItem funcionariosItem = new JMenuItem("Funcionários");
		funcionariosItem.addActionListener(e -> new FormularioFuncionario().setVisible(true));
		cadastrosMenu.add(funcionariosItem);

		JMenu estoqueMenu = new JMenu("Estoque");
		menuBar.add(estoqueMenu);

		JMenuItem consultarEstoqueItem = new JMenuItem("Consultar Estoque");
		consultarEstoqueItem.addActionListener(e -> new ConsultarEstoque().setVisible(true));
		estoqueMenu.add(consultarEstoqueItem);

		JMenuItem adicionarProdutoEstoqueItem = new JMenuItem("Adicionar Produto ao Estoque");
		adicionarProdutoEstoqueItem.addActionListener(e -> new AdicionarProdutoEstoque().setVisible(true));
		estoqueMenu.add(adicionarProdutoEstoqueItem);

		JMenuItem removerProdutoEstoqueItem = new JMenuItem("Remover Produto do Estoque");
		removerProdutoEstoqueItem.addActionListener(e -> new RemoverProdutoEstoque().setVisible(true));
		estoqueMenu.add(removerProdutoEstoqueItem);

		JMenu vendasMenu = new JMenu("Vendas");
		menuBar.add(vendasMenu);

		JMenuItem realizarVendaItem = new JMenuItem("Realizar Venda");
		realizarVendaItem.addActionListener(e -> new RealizarVenda().setVisible(true));
		vendasMenu.add(realizarVendaItem);

		JMenuItem consultarVendasItem = new JMenuItem("Consultar Vendas");
		consultarVendasItem.addActionListener(e -> new ConsultarVendas().setVisible(true));
		vendasMenu.add(consultarVendasItem);

		JMenuItem relatoriosVendasItem = new JMenuItem("Relatórios de Vendas");
		relatoriosVendasItem.addActionListener(e -> new RelatoriosVendas().setVisible(true));
		vendasMenu.add(relatoriosVendasItem);

		JMenu comprasMenu = new JMenu("Compras");
		menuBar.add(comprasMenu);

		JMenuItem registrarCompraItem = new JMenuItem("Registrar Compra");
		registrarCompraItem.addActionListener(e -> new RegistrarCompra().setVisible(true));
		comprasMenu.add(registrarCompraItem);

		JMenuItem consultarComprasItem = new JMenuItem("Consultar Compras");
		consultarComprasItem.addActionListener(e -> new ConsultarCompras().setVisible(true));
		comprasMenu.add(consultarComprasItem);

		JMenuItem relatoriosComprasItem = new JMenuItem("Relatórios de Compras");
		relatoriosComprasItem.addActionListener(e -> new RelatoriosCompras().setVisible(true));
		comprasMenu.add(relatoriosComprasItem);

		JMenu financasMenu = new JMenu("Finanças");
		menuBar.add(financasMenu);

		JMenuItem fluxoCaixaItem = new JMenuItem("Fluxo de Caixa");
		fluxoCaixaItem.addActionListener(e -> new FluxoCaixa().setVisible(true));
		financasMenu.add(fluxoCaixaItem);

		JMenuItem contasPagarItem = new JMenuItem("Contas a Pagar");
		contasPagarItem.addActionListener(e -> new ContasPagar().setVisible(true));
		financasMenu.add(contasPagarItem);

		JMenuItem contasReceberItem = new JMenuItem("Contas a Receber");
		contasReceberItem.addActionListener(e -> new ContasReceber().setVisible(true));
		financasMenu.add(contasReceberItem);

		JMenu relatoriosMenu = new JMenu("Relatórios");
		menuBar.add(relatoriosMenu);

		JMenuItem relatorioEstoqueItem = new JMenuItem("Relatório de Estoque");
		relatorioEstoqueItem.addActionListener(e -> new RelatorioEstoque().setVisible(true));
		relatoriosMenu.add(relatorioEstoqueItem);

		JMenuItem relatorioClientesItem = new JMenuItem("Relatório de Clientes");
		relatorioClientesItem.addActionListener(e -> new RelatorioClientes().setVisible(true));
		relatoriosMenu.add(relatorioClientesItem);

		JMenuItem relatorioVendasItem = new JMenuItem("Relatório de Vendas");
		relatorioVendasItem.addActionListener(e -> new RelatorioVendas().setVisible(true));
		relatoriosMenu.add(relatorioVendasItem);

		JMenuItem relatorioComprasItem = new JMenuItem("Relatório de Compras");
		relatorioComprasItem.addActionListener(e -> new RelatorioCompras().setVisible(true));
		relatoriosMenu.add(relatorioComprasItem);

		JMenu configuracoesMenu = new JMenu("Configurações");
		menuBar.add(configuracoesMenu);

		JMenuItem configuracoesUsuarioItem = new JMenuItem("Configurações de Usuário");
		configuracoesUsuarioItem.addActionListener(e -> new ConfiguracoesUsuario().setVisible(true));
		configuracoesMenu.add(configuracoesUsuarioItem);

		JMenuItem configuracoesSistemaItem = new JMenuItem("Configurações de Sistema");
		configuracoesSistemaItem.addActionListener(e -> new ConfiguracoesSistema().setVisible(true));
		configuracoesMenu.add(configuracoesSistemaItem);

		JMenuItem backupRestauracaoItem = new JMenuItem("Backup e Restauração");
		backupRestauracaoItem.addActionListener(e -> new BackupRestauracao().setVisible(true));
		configuracoesMenu.add(backupRestauracaoItem);

		JMenuItem sairItem = new JMenuItem("Sair");
		sairItem.addActionListener(e -> System.exit(0));
		menuBar.add(Box.createHorizontalGlue());
		menuBar.add(sairItem);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new MenuPrincipal().setVisible(true));
	}
}
